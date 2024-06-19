Real-Time Chat Application
A real-time chat application built with Java, Android Studio, Firebase Authentication, Firebase Firestore for database, and Firebase Cloud Messaging for push notifications.

Features

User Authentication (Sign up, Sign in)

Real-time messaging

Push notifications for new messages

User presence (online/offline status)

Profile management (username, profile picture)

Direct messages

Screenshots

![image](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/14cc1c80-6db9-4544-b5a1-852540c94391)

![image](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/74c456d3-b2cc-4350-94da-69e64a574e80)

![image](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/46a9c113-8c37-44e5-9577-5b454c70d821)

![image](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/e291797b-627c-46f0-9d50-96995b47405a)


Prerequisites
Before you begin, ensure you have met the following requirements:

Android Studio installed on your computer

Java JDK installed

A Firebase project set up with Firestore, Authentication, and Cloud Messaging enabled

Getting Started

Firebase Setup

Go to the Firebase Console.

Create a new project or use an existing one.

Add an Android app to your Firebase project.

Register your app with your package name and download the google-services.json file.

Place the google-services.json file in the app directory of your Android Studio project.

Enable Firebase Authentication (Email/Password provider).

Set up Firestore database.

Enable Firebase Cloud Messaging.

Clone the Repository

Sync the project with Gradle files.

Dependencies

Ensure you have the following dependencies in your build.gradle (app level) file:

dependencies {
    implementation 'com.google.firebase:firebase-auth:XX.X.X'
    implementation 'com.google.firebase:firebase-firestore:XX.X.X'
    implementation 'com.google.firebase:firebase-messaging:XX.X.X'
    implementation 'androidx.appcompat:appcompat:XX.X.X'
    implementation 'androidx.constraintlayout:constraintlayout:XX.X.X'
    // Add other dependencies as needed
}

Configuration
Ensure your build.gradle (project level) includes the Google services classpath:
gradle
Copy code
buildscript {
    dependencies {
        classpath 'com.google.gms:google-services:XX.X.X'
    }
}

Apply the Google services plugin in your build.gradle (app level) file:

apply plugin: 'com.google.gms.google-services'
Run the App
Connect your Android device or start an emulator.
Click Run (Shift + F10) in Android Studio.
Usage
Sign up or sign in with your email and password.
Start a new chat or join an existing chat.
Send and receive messages in real-time.
Receive push notifications for new messages.
Contributing
Contributions are welcome! Please follow these steps:

Acknowledgements

Firebase

Android Studio
