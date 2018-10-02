package config


object TwitterConfig extends AppConfig {

  val twitterConfig = conf.getConfig("twitter")

  val accessToken = twitterConfig.getString("access.key")
  val accessTokenPrivate = twitterConfig.getString("access.secret")

  val consumerKey = twitterConfig.getString("consumer.key")
  val consumerPrivate = twitterConfig.getString("consumer.secret")

}
