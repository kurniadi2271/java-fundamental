# JavaExam

A Java project demonstrating basic programming concepts including an ATM simulation and an HR management system.

## Project Structure

This project contains two main components:

### 1. ATM Simulation (`com.juaracoding.first`)
- `SimulasiATM.java`: A console-based ATM simulator with login, balance check, deposit, and withdrawal functionality.

### 2. HR Management System (`com.juaracoding.second`)
- `Karyawan.java`: Employee class with salary calculation and management features
- `Divisi.java`: Division class for managing groups of employees

## Technologies Used

- **Java**: Version 17
- **Maven**: Build tool and dependency management
- **TestNG**: Testing framework
- **Apache POI**: For Excel file operations

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd JavaExam
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

## Running the Application

### ATM Simulation
Run the ATM simulator:
```bash
mvn exec:java -Dexec.mainClass="com.juaracoding.first.SimulasiATM"
```

**Login Credentials:**
- Username: `admin`
- Password: `admin`

### Running Tests
Execute all tests using TestNG:
```bash
mvn clean test
```

The test suite is configured in `src/test/resources/testng.xml` and includes tests for:
- Employee functionality (`KaryawanTest.java`)
- Division functionality (`DivisiTest.java`)
- HR System integration (`HRSystemTest.java`)

## Test Reports

After running tests, view the HTML report at:
```
target/surefire-reports/index.html
```

## Dependencies

- **TestNG 7.10.2**: Testing framework
- **Apache POI 5.2.3**: Java API for Microsoft Documents (for Excel operations)

## Build Configuration

The project uses Maven with the following key configurations:
- Source compatibility: Java 17
- Target compatibility: Java 17
- UTF-8 encoding
- Surefire plugin for TestNG execution

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Run the test suite
6. Submit a pull request

## License

This project is licensed under the MIT License - see the LICENSE file for details.