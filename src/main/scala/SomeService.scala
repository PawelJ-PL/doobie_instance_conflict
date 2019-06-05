import cats.Functor

trait SomeService[F[_]] {
  def something(): F[String]
}

object SomeService {
  def apply[F[_]](implicit ev: SomeService[F]): SomeService[F] = ev
  def instance[F[_]: Functor]: SomeService[F] = new SomeService[F] {
    override def something(): F[String] = ???
  }
}
