package io.saagie.formation.devops.spark

import io.saagie.formation.devops.ApacheAccessLog
import org.apache.spark.rdd.RDD
import org.apache.spark.util.StatCounter

/* Statistiques sur la taille des requêtes */
case class Spark5(rdd: RDD[String]) {

  def process: StatCounter = ???
}
