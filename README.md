# DESIGN PATTERNS in JAVA

![DESIGN PATTERNS in JAVA](./img/java.png)

### The Catalog of java Examples

- Creational Patterns: These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

  - Abstract Factory

  ![Abstract Factory](./img/abstract-factory-mini.png)

  Lets you produce families of related objects without specifying their concrete classes.

  [Main article](https://refactoring.guru/design-patterns/abstract-factory)

  [Usage in Java](https://refactoring.guru/design-patterns/abstract-factory/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/abstract-factory/java/example#example-0)

  - Builder

  ![Builder](./img/builder-mini.png)

  Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

  [Main article](https://refactoring.guru/design-patterns/factory-method)

  [Usage in Java](https://refactoring.guru/design-patterns/builder/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/factory-method/java/example#example-0)

  - Factory Method

  ![Factory Method](./img/factory-method-mini.png)

  Lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

  [Main article](https://refactoring.guru/design-patterns/builder)

  [Usage in Java](https://refactoring.guru/design-patterns/factory-method/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/builder/java/example#example-0)

  - Prototype

  ![Prototype](./img/prototype-mini.png)

  Lets you copy existing objects without making your code dependent on their classes.

  [Main article](https://refactoring.guru/design-patterns/prototype)

  [Usage in Java](https://refactoring.guru/design-patterns/prototype/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/prototype/java/example#example-0)

  - Singleton

  ![Singleton](./img/singleton-mini.png)

  Lets you ensure that a class has only one instance, while providing a global access point to this instance.

  [Main article](https://refactoring.guru/design-patterns/singleton)

  [Usage in Java](https://refactoring.guru/design-patterns/singleton/java/example#lang-features)

  [Naïve Singleton](https://refactoring.guru/design-patterns/singleton/java/example#example-0)

  [Thread-safe Singleton](https://refactoring.guru/design-patterns/singleton/java/example#example-2)

- Structural Patterns: These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

  - Adapter

  ![Adapter](./img/adapter-mini.png)

  Allows objects with incompatible interfaces to collaborate.

  [Main article](https://refactoring.guru/design-patterns/adapter)

  [Usage in Java](https://refactoring.guru/design-patterns/adapter/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/adapter/java/example#example-0)

  - Bridge

  ![Bridge](./img/bridge-mini.png)

  Lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

  [Main article](https://refactoring.guru/design-patterns/bridge)

  [Usage in Java](https://refactoring.guru/design-patterns/bridge/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/bridge/java/example#example-0)

  - Composite

  ![Composite](./img/composite-mini.png)

  Lets you compose objects into tree structures and then work with these structures as if they were individual objects.

  [Main article](https://refactoring.guru/design-patterns/composite)

  [Usage in Java](https://refactoring.guru/design-patterns/composite/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/composite/java/example#example-0)

  - Decorator

  ![Decorator](./img/decorator-mini.png)

  Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

  [Main article](https://refactoring.guru/design-patterns/decorator)

  [Usage in Java](https://refactoring.guru/design-patterns/decorator/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/decorator/java/example#example-0)

  - Facade

  ![Facade](./img/facade-mini.png)

  Provides a simplified interface to a library, a framework, or any other complex set of classes.

  [Main article](https://refactoring.guru/design-patterns/facade)

  [Usage in Java](https://refactoring.guru/design-patterns/facade/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/facade/java/example#example-0)

  - Flyweight

  ![Flyweight](./img/flyweight-mini.png)

  Lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

  [Main article](https://refactoring.guru/design-patterns/flyweight)

  [Usage in Java](https://refactoring.guru/design-patterns/flyweight/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/flyweight/java/example#example-0)

  - Proxy

  ![Proxy](./img/proxy-mini.png)

  Lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

  [Main article](https://refactoring.guru/design-patterns/proxy)

  [Usage in Java](https://refactoring.guru/design-patterns/proxy/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/proxy/java/example#example-0)

- Behavioral Patterns: These patterns are concerned with aljavarithms and the assignment of responsibilities between objects.

  - Chain of Responsibility

  ![Chain of Responsibility](./img/chain-of-responsibility-mini.png)

  Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

  [Main article](https://refactoring.guru/design-patterns/chain-of-responsibility)

  [Usage in Java](https://refactoring.guru/design-patterns/chain-of-responsibility/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/chain-of-responsibility/java/example#example-0)

  - Command

  ![Command](./img/command-mini.png)

  Turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.

  [Main article](https://refactoring.guru/design-patterns/command)

  [Usage in Java](https://refactoring.guru/design-patterns/command/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/command/java/example#example-0)

  - Iterator

  ![Iterator](./img/iterator-mini.png)

  Lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

  [Main article](https://refactoring.guru/design-patterns/iterator)

  [Usage in Java](https://refactoring.guru/design-patterns/iterator/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/iterator/java/example#example-0)

  - Mediator

  ![Mediator](./img/mediator-mini.png)

  Lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

  [Main article](https://refactoring.guru/design-patterns/mediator)

  [Usage in Java](https://refactoring.guru/design-patterns/mediator/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/mediator/java/example#example-0)

  - Memento

  ![Memento](./img/memento-mini.png)

  Lets you save and restore the previous state of an object without revealing the details of its implementation.

  [Main article](https://refactoring.guru/design-patterns/memento)

  [Usage in Java](https://refactoring.guru/design-patterns/memento/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/memento/java/example#example-0)

  - Observer

  ![Observer](./img/observer-mini.png)

  Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing.

  [Main article](https://refactoring.guru/design-patterns/observer)

  [Usage in Java](https://refactoring.guru/design-patterns/observer/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/observer/java/example#example-0)

  - State

  ![State](./img/state-mini.png)

  Lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

  [Main article](https://refactoring.guru/design-patterns/state)

  [Usage in Java](https://refactoring.guru/design-patterns/state/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/state/java/example#example-0)

  - Strategy

  ![Strategy](./img/strategy-mini.png)

  Lets you define a family of aljavarithms, put each of them into a separate class, and make their objects interchangeable.

  [Main article](https://refactoring.guru/design-patterns/strategy)

  [Usage in Java](https://refactoring.guru/design-patterns/strategy/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/strategy/java/example#example-0)

  - Template Method

  ![Template Method](./img/template-method-mini.png)

  Defines the skeleton of an aljavarithm in the superclass but lets subclasses override specific steps of the aljavarithm without changing its structure.

  [Main article](https://refactoring.guru/design-patterns/template-method)

  [Usage in Java](https://refactoring.guru/design-patterns/template-method/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/template-method/java/example#example-0)

  - Visitor

  ![Visitor](./img/visitor-mini.png)

  Lets you separate aljavarithms from the objects on which they operate.

  [Main article](https://refactoring.guru/design-patterns/visitor)

  [Usage in Java](https://refactoring.guru/design-patterns/visitor/java/example#lang-features)

  [Code example](https://refactoring.guru/design-patterns/visitor/java/example#example-0)

Reference by [REFACTORING GURU](https://refactoring.guru/design-patterns/java)
