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

![WhatsApp Image 2024-06-11 at 2 39 45 PM](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/f2379e28-1f52-4527-afae-f830807b455c)

![WhatsApp Image 2024-06-11 at 2 39 46 PM](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/9662baec-c443-4b36-a90c-e82318b43197)

![WhatsApp Image 2024-06-11 at 2 39 45 PM (1)](https://github.com/SyedddArham/Real-Time-Chat-Application/assets/149482468/42c63ee6-4d5c-42ea-8f1f-11e89ea92dc9)


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
