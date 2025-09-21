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
