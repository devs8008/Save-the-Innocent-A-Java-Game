<div id="save-the-innocent">
  <h1>Save the Innocent</h1>
  <p>Save the Innocent is a simple but intense guessing game built on a <strong>First-In, First-Out (FIFO)</strong> logic. Your mission is to find and save the innocent person hidden within a queue before it's too late.</p>
  <h2>🧠 How It Works</h2>
  <p>The game uses a queue (or stack, as you mentioned, but FIFO is queue behavior) where each element represents a person:</p>
  <ul>
    <li><strong>0</strong> stands for a prisoner.</li>
    <li><strong>1</strong> stands for the single innocent person.</li>
  </ul>
  <p>Your goal is to guess the innocent's position (index) in the line.</p>
  <h2>🕹️ Gameplay</h2>
  <p>The game unfolds with each guess you make:</p>
  <ol>
    <li>A person at the front of the line is executed (removed from the queue).</li>
    <li>The remaining people in line shift forward, changing the innocent's index.</li>
    <li>You'll receive hints to guide your next guess:
      <ul>
        <li><strong>"Too low"</strong>: Your guess was below the innocent's current index.</li>
        <li><strong>"Too high"</strong>: Your guess was above the innocent's current index.</li>
      </ul>
    </li>
  </ol>
  <p>If you guess the correct index, you save the innocent and win the game! But if the innocent person reaches the front of the line before you guess their position, they are executed, and you lose.</p>
</div>
