
# Mobile Testing on EriBankMobileApp

This repository contains code and instructions for completing a mobile testing project. I've used Appium and Selenium in an Android environment to simulate user behavior and ensure the Android app reacts correctly.

## Table of Contents

- [Project Description](#project-description)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [1. Download the Test App](#1-download-the-test-app)
  - [2. Install Node.js and npm](#2-install-nodejs-and-npm)
  - [3. Install Appium](#3-install-appium)
  - [4. Install Android Studio](#4-install-android-studio)
  - [5. Download Appium](#5-download-appium)
  - [6. Set Environment Variables](#6-set-environment-variables)
  - [7. Start Appium Server](#7-start-appium-server)
  - [8. Create an Android Virtual Device (AVD)](#8-create-an-android-virtual-device-avd)
  - [9. Start the AVD](#9-start-the-avd)
- [Project Instructions](#assignment-instructions)


## Project Description
This project focuses on mobile testing of the EriBankMobileApp, an Android application, using the powerful combination of Selenium and Appium. Test Scenarios:

1. **Login Validation:**
   - Validates login view presence.
   - Enters and clears a test username.
   - Tests login button, ensuring a transition to the summary page.

2. **Make Payment Process:**
   - Initiates the payment process, validating the transition.
   - Enters payment details and handles interactions (e.g., slider, buttons).
   - Tests cancel button and verifies the return to the summary page.

3. **Additional Payment Scenario:**
   - Repeats the payment process with new data, including country selection.
   - Handles alerts during payment.

4. **Logout:**
   - Tests logout button, confirming the return to the login page.

## Prerequisites

Before you begin, ensure you have the following software and tools installed:
-Make sure you are using java version 8
- Android app: [Download EriBank.apk](https://code.google.com/archive/p/eribank/downloads) and place it in the "Assign/app" directory.
- Node.js and npm: [Download and install Node.js](https://nodejs.org/en/download) (Windows users, make sure to check both the "npm package manager" and "Add to PATH" during installation).
- Appium: Run the following commands in Command Prompt:
  ```
  > npm install node
  > npm install appium
  ```
- Android Studio: [Download and install Android Studio](https://developer.android.com/studio).
- Appium: [Download Appium](http://appium.io/) for your specific environment (Mac, Windows, Linux).

## Getting Started

Follow these steps to set up your environment for the mobile testing project :

### 1. Download the Test App

Download the Android app [EriBank.apk](https://code.google.com/archive/p/eribank/downloads) and place it in the "Assign/app" directory.

### 2. Install Node.js and npm

Install Node.js from [the official website](https://nodejs.org/en/download). During installation on Windows, ensure you check both "npm package manager" and "Add to PATH."

### 3. Install Appium

Open Command Prompt and run the following commands:

```
> npm install node
> npm install appium
```

### 4. Install Android Studio

Download and install Android Studio from [the official website](https://developer.android.com/studio).

### 5. Download Appium

Download Appium from [the Appium website](http://appium.io/).

### 6. Set Environment Variables

- Open Appium and go to "Edit Configurations."
- Set the `ANDROID_HOME` variable to the location of the Android SDK directory. For Windows, this is typically found at "C:\Users\%USER%\AppData\Local\Android\Sdk."
- Set the `JAVA_HOME` variable to your Java installation directory.

### 7. Start Appium Server

Start a simple Appium server on the default port 4723. If you wish to use an alternate port, update the `portNumber` variable in Main.java. This server will be the application's connection to the emulator.

### 8. Create an Android Virtual Device (AVD)

Open Android Studio and locate the AVD Manager in "Configure." Create a new virtual device as a "Pixel 4 XL" with "Lollipop" from the Recommended section and an API level of 22. Download the required system image if prompted.

### 9. Start the AVD

Start the Android Virtual Device and turn it on.

## Project Instructions

Now the environment is set. I have written 27 test cases for the app. The result will be stored in the output.txt file. 

