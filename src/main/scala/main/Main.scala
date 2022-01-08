package main

class Main extends App {

  val compress = Compressor

  val text = "SUSIE SAYS IT IS EASY"
  val compressingText = compress.code(text)
  println(compressingText)

  val decompressingText = compress.decode(compressingText)
  println(decompressingText)

}
