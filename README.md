## Factory Method
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


## Abstract factory

                <<interface>>
                  Button
                 + paint()

                <<interface>>
                 Checkbox
                 + paint()

        ┌───────────┬─────────────┐
        │           │             │
        ▼           ▼             ▼
WindowsButton   MacButton   (outros...)
WindowsCheckbox MacCheckbox


                <<interface>>
                 UIFactory
+ createButton(): Button
+ createCheckbox(): Checkbox

  ┌───────────────┬─────────────────┐
  │               │                 │
  ▼               ▼                 ▼
  WindowsFactory     MacFactory       (outros...)
+ createButton()   + createButton()
+ createCheckbox() + createCheckbox()


                Application
         - button: Button
         - checkbox: Checkbox
