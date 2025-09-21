          <<interface>>
          Transport
          + deliver()

┌──────────┬───────────┬────────────┐
│          │           │            │
▼          ▼           ▼            ▼
Car       Bike      Motorcycle
+deliver() +deliver() +deliver()


          <<abstract>>
      TransportFactory
      + createTransport(): Transport

┌──────────────┬───────────────────┐
│              │                   │
▼              ▼                   ▼
CarTransport   BikeTransport    MotorcycleTransport
+ createTransport()             + createTransport()
  (return Car)                    (return Motorcycle)
