
import com.danielasfregola.twitter4s.TwitterStreamingClient
import com.danielasfregola.twitter4s.entities.Tweet
import com.danielasfregola.twitter4s.entities.enums.Language
import com.danielasfregola.twitter4s.entities.streaming.StreamingMessage


object Main extends App {

  // Start streaming tweets (Token are automatically taken from the application.conf file)
  val client = TwitterStreamingClient()
  client.filterStatuses(tracks = Seq("weather"), languages = Seq(Language.English))(printTweetText)

  // Printing tweets that have been analyzed
  def printTweetText: PartialFunction[StreamingMessage, Unit] = {
    case tweet: Tweet => {
      Analyzer.analyzeTweets(tweet.text) match {
        case x if x >= 1 =>  println("Tweet : \'" + tweet.text + "\' is positive")
        case x if x <= -1 =>  println("Tweet : \'" + tweet.text + "\' is negative")
        case _ =>
      }
    }
  }


}


