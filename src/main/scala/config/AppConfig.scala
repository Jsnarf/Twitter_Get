package config

import com.typesafe.config.ConfigFactory

trait AppConfig {

  val conf = ConfigFactory.load()

}
