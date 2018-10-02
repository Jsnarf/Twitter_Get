

object Analyzer {

  // Dictionnary that needs to be filled with more different words
  val goodWords: Array[String] = Array("good", "nice", "great")
  val badWords: Array[String] = Array("bad", "severe", "strong")

  def analyzeTweets(tweet: String): Int = {
    val tweetWords: Array[String] = tweet.toLowerCase.replace(",","").replace(".","")split(" ")
    val tweetValue: Array[Int] = tweetWords.map(word => {
      if (goodWords contains word) return 1
      if (badWords contains word) return -1
      return 0
    })
    tweetValue.sum
  }

}
