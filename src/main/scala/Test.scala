package perf

import com.google.protobuf.CodedOutputStream
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State


@State(Scope.Thread)
class Test {
  val msg = Msg.Message3.newBuilder.setA(4).setB(5).setC(6).build()
  val b = new Array[Byte](1000)

  @Benchmark
  def message3: Unit = {
    msg.toByteArray
  }

  @Benchmark
  def int32s: Unit = {
    val cos = CodedOutputStream.newInstance(b)
    var i = 0
    while (i < 100) {
      cos.writeInt32NoTag(i);
      i+=1
    }
  }
}
