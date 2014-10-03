package geotrellis.spark.io.hadoop

import geotrellis.spark._
import geotrellis.spark.io._
import org.apache.hadoop.fs.Path
import org.apache.spark.SparkContext

import scala.util.Try

trait HdfsDriver[K] extends Driver[K]{
  type Params = Path

  def load[K](sc: SparkContext)(path: Path, metaData: LayerMetaData,
                                filters: FilterSet[K] = new FilterSet[K]()): Try[RasterRDD[K]] = ???
}
