package main

object Main extends App {

  val compress = Compressor

  val text = "SUSIE SAYS IT IS EASY"

  val compresslessText = text.toList
    .map(ch => Integer.toBinaryString(ch))
    .foldLeft("")(_ + _)
  println("uncompressed code: " + compresslessText)
  println("full length: " + compresslessText.length)

  val compressingText = compress.code(text)
  println("compressed code: " + compressingText)
  println("compressed length: " + compressingText.length)

  println("compressed in: " + (compresslessText.length / (1f * compressingText.length)))

  val decompressingText = compress.decode(compressingText)
  println(decompressingText)

}
