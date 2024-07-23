#  Santander Dev Week 2024
## 📊 Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -List~Feature~ features
        -Card card
        -List~News~ news
    }
    
    class Account {
        -String accountNumber
        -String agencyNumber
        -float accountBalance
        -float accountLimit
    }
    
    class Feature {
        -String icons
        -String description
    }
    
    class Card {
        -String cardNumber
        -String description
    }
    
    class News {
        -String newsIcon
        -String newDescription
    }
    
    User "1" *--> "1" Account
    User "1" *--> "N" Feature
    User "1" *--> "1" Card
    User "1" *--> "N" News
```
