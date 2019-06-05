import doobie.free.connection.ConnectionIO

object Application extends App {
  type DB[A] = ConnectionIO[A]
  val inst: SomeService[DB] = SomeService.instance[DB]
}
