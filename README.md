# Spring AOP Example Project

This project demonstrates the use of Aspect-Oriented Programming (AOP) in the Spring Framework. It showcases how to modularize cross-cutting concerns such as logging, notifications, and transaction management using Spring AOP.

## Project Overview

In this example, we've created an **Account** class with methods for deposit, withdrawal, and recharge. Using AOP, we handle cross-cutting concerns like sending messages before and after certain method executions, and around method executions to monitor or modify their behavior.

## Features

- **Before Advice**: Display a message before a method is executed.
- **After Advice**: Display a message after a method completes execution.
- **Around Advice**: Intercept the method execution to execute custom code before and after the method.

## Technologies Used

- **Java 8+**
- **Spring Framework**
- **Spring AOP**
- **Spring Boot** (for automatic configuration)
- **Maven** (for dependency management)

## Getting Started

### 1. Clone the Repository

Clone the repository to your local machine.

### 2. Build the Project

Using Maven, you can build the project.

### 3. Run the Application

Once the project is built, you can run it.

### 4. Execution

When you run the application, it will invoke the **Deposite** method of the **Account** class. The AOP advice will execute before, after, and around the method execution, sending messages like "Enter Your PIN..." and "Your Current Amount is 40000."

## Code Structure

- **Account.java**: Contains methods related to account operations.
- **MassageAspects.java**: Contains the AOP logic for handling the cross-cutting concerns.
- **MyConfiguration.java**: Configures Spring beans and enables AOP.
- **Main.java**: The entry point of the application, where the Spring context is initialized and the **Deposite** method is called.

## Example Output

- Enter Your PIN.....
- Your Amount is Deposited..........
- Your Plan Expiring Soon......
- Please Recharge Recharge Successfully........ 
- Your Current Amount is 40000.............

## License

This project is licensed under the MIT License.


