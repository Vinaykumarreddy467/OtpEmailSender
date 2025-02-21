# OtpEmailSender


Here is a `README.md` file for your project that provides an explanation of the project and its applications.

---

# Email OTP Verification Project

## Overview

This project is an implementation of a One-Time Password (OTP) verification system using Java. The system allows a user to input their email and mobile number, then generates and sends a 6-digit OTP to the provided email address. Once the user enters the OTP, the system verifies whether it matches the generated OTP, thereby confirming the user's identity.

## Features

- **Email Verification**: The system uses JavaMail API to send an OTP to the user's email address.
- **OTP Generation**: A 6-digit random OTP is generated to be sent to the user.
- **Input Validation**: Validates that the mobile number is exactly 10 digits and the email is properly formatted.
- **OTP Verification**: The user inputs the received OTP, and the system verifies it to authenticate the user.
- **Error Handling**: If the user inputs an incorrect OTP or invalid mobile number, the system prompts them with appropriate error messages.

## Project Structure

- **emailSender.java**: This class contains the main logic for sending the email with the OTP and verifying the OTP entered by the user. It handles:
  - Gathering user input for name, mobile number, and email address.
  - OTP generation and email sending using JavaMail API.
  - Prompting the user to input the received OTP for verification.
  
- **App.java**: The main class that triggers the email-sending and OTP-verification process. It calls the methods from `emailSender` and provides feedback based on whether the user was successfully verified or not.

## How the Project Works

1. **Input Collection**: 
   - The program asks for the user's name, 10-digit mobile number, and email address.
   - It validates the mobile number to ensure it has exactly 10 digits.

2. **OTP Generation and Email Sending**:
   - The system generates a random 6-digit OTP.
   - It uses the **JavaMail API** to send the OTP to the user's email address.

3. **OTP Verification**:
   - After sending the email, the user is prompted to enter the OTP they received.
   - If the OTP matches the one generated by the system, the user is successfully verified. Otherwise, an error message is displayed.

## Applications

- **User Authentication**: This project can be used as part of a larger authentication system where verifying a user's identity via email is required.
- **Security Systems**: OTP-based systems are widely used for multi-factor authentication (MFA) in banking, e-commerce, and any application where security is a concern.
- **Password Reset Systems**: This system can be extended to verify users before allowing them to reset their passwords.
- **User Registration**: Verifying a user’s email address during the registration process ensures the authenticity of the information provided.

## Technologies Used

- **Java**: The core programming language used to build the application.
- **JavaMail API**: Used for sending emails via SMTP to the user's email address.
- **Random Class**: Used for generating the random 6-digit OTP.
- **SMTP Protocol**: The Simple Mail Transfer Protocol (SMTP) is used to send the OTP to the provided email address.

## Prerequisites

Before running this project, ensure you have the following:

- **Java Development Kit (JDK)** installed (version 8 or above).
- **JavaMail API** library included in your project dependencies.
- An **app-specific password** for your Gmail account, as Google requires it for sending emails through JavaMail API. This password should be set up in your Gmail account and used in the `emailSender` class.

## How to Run the Project

1. Clone this repository or download the source code.
2. Ensure you have the necessary Java dependencies installed, particularly the **JavaMail API**.
3. Open the project in your preferred IDE (such as Eclipse or IntelliJ IDEA).
4. Modify the email credentials in the `emailSender` class:
   ```java
   final String username = "your-email@gmail.com";
   final String password = "your-app-password"; 
   ```
   Replace these with your own Gmail email address and the app-specific password.
5. Run the `App.java` class.
6. Follow the prompts in the console to enter your name, mobile number, and email address.
7. After receiving the OTP in your email, enter the OTP in the console to complete verification.

## Future Enhancements

- **Mobile Number Verification**: Add SMS-based OTP sending using an external SMS API.
- **Improved Validation**: Enhance email format validation and add regular expressions to verify input formats more strictly.
- **Resend OTP Feature**: Implement a feature allowing users to request the OTP to be resent if they didn't receive it initially.

## License

This project is open-source. Feel free to modify and enhance it for your needs.

--------
# OtpEmailSender
