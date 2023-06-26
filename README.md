# hotelRating_Microservice
In this project  I have create hotel microservices  with Java Spring and different database connected to it.

Microservices is an architectural style that structures an application as a collection of small, independent,
and loosely coupled services. Each service is designed to perform a specific business function and can be developed, 
deployed, and scaled independently of other services. These services communicate with each other through well-defined APIs 
(Application Programming Interfaces).

Here are some key characteristics and principles of microservices:

• Decentralized architecture: Microservices promote a decentralized approach to building applications. 
Instead of having a monolithic architecture where all functionality is bundled together, the application is divided
into smaller services that can be developed and managed independently.

• Service boundaries: Each microservice represents a specific business capability or function. 
For example, a typical e-commerce application might have separate services for user management, 
inventory management, order processing, and payment processing. This allows for better separation of 
concerns and enables teams to focus on specific services.

• Independently deployable: Microservices are designed to be deployed independently of each other.
This means that developers can make changes to a particular service without affecting the entire application.
It also allows for faster deployment cycles and reduces the risk of introducing bugs or downtime.

• Loose coupling: Microservices communicate with each other through APIs, typically using lightweight protocols such 
as HTTP or messaging systems like RabbitMQ or Kafka. This loose coupling allows services to evolve independently, 
as long as the API contracts are maintained.

• Scalability: Microservices offer the ability to scale individual services based on demand. 
This means that if a particular service is experiencing high traffic, it can be scaled up independently 
without affecting other services. This scalability helps optimize resource usage and improve overall system performance.

• Resilience: Microservices are designed to be resilient in the face of failures. 
If a particular service goes down or becomes unresponsive, it doesn't bring down the entire application. 
Instead, other services can continue to function, and the failed service can be restored independently.

• Technology diversity: Microservices allow for the use of different technologies and programming languages for each service.
This enables teams to choose the most suitable tools for the specific requirements of their service. However, it's important 
to strike a balance between technology diversity and operational complexity.

While microservices offer several advantages, they also introduce challenges such as increased operational complexity, 
distributed system management, and ensuring data consistency across services. Proper service design, communication protocols, 
and monitoring systems are important to address these challenges effectively.

Overall, microservices provide a flexible and scalable approach to developing complex 
applications by breaking them down into smaller, manageable components that can be independently developed, deployed, and scaled.
