import mill._
import mill.scalalib._
import coursier.maven.{ MavenRepository }

object jaitest
  extends ScalaModule
{
  def repositoriesTask = T.task { super.repositoriesTask() ++ Seq(
    MavenRepository("https://repo.osgeo.org/repository/release/"),
  ) }

  def scalaVersion = "2.12.8"

  def ivyDeps = Agg(
    ivy"org.geotools:gt-main:24.0",
  )

}