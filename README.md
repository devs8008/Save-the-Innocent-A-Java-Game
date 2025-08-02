# Save-the-Innocent-A-Java-Game
Save the Innocent is a FIFO-based guessing game. A queue contains 0s (prisoners) and one 1 (innocent). Guess the index of the innocent. Each guess removes the front person. Get hints: "Too low" or "Too high" until you find the innocent and save them!


🕹️ Save the Innocent
Save the Innocent is a simple but intense guessing game based on a First-In-First-Out (FIFO) stack logic. Within the stack, each element represents a person —

0 stands for a prisoner,

1 stands for the innocent (only one innocent exists per round).

Your mission: Find the innocent before it's too late.

🧠 How it works:
The stack behaves like a queue — the first person in line is always the first to be removed.

Every time you make a guess:

The person at the front of the stack is executed (removed).

If your guess index is lower than the actual index of the innocent, the game will respond: "Too low".

If your guess index is higher, it responds: "Too high".

If you guess correctly, you save the innocent!
