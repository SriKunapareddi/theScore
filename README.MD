Project Overview
This project is designed to automate testing for theScore application using Java 11,Appium 2.0, and Maven. The testing environment is set up with Android Studio for device management and the necessary APK file for theScore app. Appium Inspector has been utilised to search for the mobile elements

Prerequisites
Before you begin, ensure you have met the following requirements:

Java 11: Make sure Java 11 is installed and configured.
Maven: Ensure Maven is installed and configured.
Android Studio: Install Android Studio for managing Android devices and emulators.
Appium 2.0: Install Appium 2.0 using npm.
Node.js and npm: Ensure Node.js and npm are installed to manage Appium and other dependencies.
Android SDK: Ensure Android SDK is installed and configured.

Environment Setup
Step 1: Install Java 11
Download and install Java 11 from the Oracle website. Set the JAVA_HOME environment variable.
bash
export JAVA_HOME=/path/to/java11
export PATH=$JAVA_HOME/bin:$PATH

windows:
setx JAVA_HOME "C:\Program Files\Java\jdk-11.0.2"

search: Each command should return the path you set for the respective environment variable.
echo %JAVA_HOME

Step 2: Install Maven
Download and install Maven from the Maven website. Set the MAVEN_HOME environment variable.
bash
export MAVEN_HOME=/path/to/maven
export PATH=$MAVEN_HOME/bin:$PATH

Step 3: Install Android Studio
Download and install Android Studio from the Android Developer website.

Step 4: Set Up Android SDK
Set the ANDROID_HOME and ANDROID_SDK_ROOT environment variables.
bash
export ANDROID_HOME=$HOME/Android/Sdk
export ANDROID_SDK_ROOT=$ANDROID_HOME
export PATH=$ANDROID_HOME/emulator:$ANDROID_HOME/tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools:$PATH

Windows:
setx ANDROID_HOME "C:\Users\YourUsername\AppData\Local\Android\Sdk"
setx ANDROID_SDK_ROOT "C:\Users\YourUsername\AppData\Local\Android\Sdk"

search: Each command should return the path you set for the respective environment variable.
echo %ANDROID_HOME%
echo %ANDROID_SDK_ROOT%

Step 5: Install Node.js and npm
Download and install Node.js from the Node.js website. npm is included with Node.js.

Step 6: Install Appium
Install Appium 2.0 using npm.
bash
npm install -g appium
npm install -g appium-doctor
npm install -g appium-uiautomator2-driver
npm install -g appium-execute-driver-plugin

Step 7: Verify Appium Installation
Run Appium Doctor to check the setup.
bash
appium-doctor --android

Step 8: Download theScore APK
Download the theScore APK file from a trusted source and place it in a directory accessible to your project. <ADD APK File>

Step 9: Running the Tests
appium <mention the command I shared to run appium>

Project Setup
Step 1: Clone the Repository
Clone the project repository from GitHub.

bash
git clone https://github.com/yourusername/thescore-project.git <URL>
cd thescore-project

Step 2: Configure Maven
Ensure the pom.xml file is properly configured

Project Structure:
theScore/
│
├── src/
│   ├── main/
│   └── test/
│       └── java/
│           └── org.example/
│               └── Pages/ [POM Design pattern]
│               └── tests.java [Junit Test]
│                       
├── pom.xml
└── README.md

Run your tests using Maven:mvn test