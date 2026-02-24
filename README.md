# ATM-DispenseProgram


🏦 ATM Cash Dispensing System
Chain of Responsibility Design Pattern

📌 Problem Statement

The Bank of the Philippine Islands (BPI) wants to develop a simple ATM cash dispensing system that releases money in the following denominations:

₱1000

₱500

₱200

₱100

₱50

₱20

The system must automatically determine how many bills of each denomination should be dispensed based on the requested withdrawal amount.

Instead of using large conditional statements (if-else or switch), the system must implement the Chain of Responsibility Design Pattern to handle the request efficiently and in an organized manner.

🎯 Objectives

Design an ATM system that dispenses cash using the available denominations.

Implement the Chain of Responsibility pattern to distribute the responsibility of handling the withdrawal request among multiple dispenser classes.

Ensure each dispenser is responsible for only one denomination.

Allow the request to pass through the chain until the entire amount is processed.

Make the system flexible so new denominations can be added without modifying existing logic.

⚙️ System Behavior

The client sends a withdrawal request (e.g., 2970, 270, 250).

The request starts at the highest denomination (₱1000).

Each dispenser:

Processes the portion it can handle.

Passes the remainder to the next dispenser in the chain.

The process continues until the full amount is dispensed.

![alt text](image.png)
