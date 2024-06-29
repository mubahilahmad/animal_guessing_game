# Animal Guessing Game

The Animal Guessing Game is an engaging and educational app where the player must guess a randomly selected animal. 
It's perfect for group fun or individual entertainment, combining elements of learning and play.

## How the App Works

### Game Mechanics

- **Random Animal Selection**: The app randomly selects an animal from a database.
- **Player's Objective**: The human player must guess the animal.

### Player Options

- **Get Hint**: Players can request up to 10 hints per animal to help identify the animal.
- **Solve**: Players can attempt to solve up to 3 times per round to guess the animal correctly.

### Data and Hints

- **Extensive Animal Collection**: The app includes data for at least 50 different animals (and has an additional 50 predators).
- **Detailed Hints**: Each animal comes with 10 unique hints focusing on various characteristics like color, habitat, diet, and size.

### Gameplay

- **Multiple Guessing Rounds**: The game is designed to be entertaining with multiple rounds of guessing.
- **Scoring System**: Players earn points based on the number of hints and attempts used. Specifically, 
     a successful guess scores 13 - n - m points, where 'n' is the number of hints used, and 'm' is the number of guessing attempts.
- **Highscore List**: The app stores the results and displays them in a highscore list to track progress and compete with friends.

## Installation

To get started with the Animal Guessing Game, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/mubahilahmad/animal_guessing_game.git
   ```
2. **Open the project in Android Studio:**
   - Select `File -> Open` and choose the cloned repository folder.
3. **Build the project:**
   - Click on `Build -> Make Project` or use the shortcut `Ctrl+F9`.
4. **Run the app:**
   - Connect an Android device or start an emulator.
   - Click on `Run -> Run 'app'` or use the shortcut `Shift+F10`.

## Usage

1. **Starting a game:**
   - Open the app and select the number of animals or predators you want to guess.
2. **Playing the game:**
   - Read the hints and enter your guess.
   - You can ask for more hints or skip to the next animal if you're stuck.
   - Your score will be displayed at the end of the game.

## Code Overview

### `Animal.kt`
Defines the `Animal` data class which implements the `AnimalInterface`. Contains a list of animal objects with their respective hints.

### `Predator.kt`
Defines the `Predator` data class which implements the `AnimalInterface`. Contains a list of predator objects with their respective hints.

### `AnimalInterface.kt`
Defines the `AnimalInterface` with properties for the name and hints of the animal or predator.

### `RoundActivity.kt`
Handles the selection of game mode and number of animals or predators to guess.

### `MainActivity.kt`
Contains the main gameplay logic where users guess the animal based on hints provided.

### `ScoreActivity.kt`
Displays the final score and allows users to save their score with a note. Also provides options to start a new game or view the profile.

### `ProfileActivity.kt`
Displays the last 5 scores saved by the user.

### `manifest.xml`
Configures the app’s activities and metadata.

### Layouts (My layout is especially suitable for the Pixel 8)

#### `activity_round.xml`
Defines the layout for `RoundActivity` where the user selects the number of animals or predators to guess.

#### `activity_main.xml`
Defines the main gameplay layout where the user guesses the animals based on hints.

#### `activity_score.xml`
Defines the layout for `ScoreActivity` where the final score is displayed, and the user can save their score or start a new game.

#### `activity_profile.xml`
Defines the layout for `ProfileActivity` where the user's past scores are displayed.

## Data Storage

The app uses Android's DataStore for saving the user's score history. Scores are stored as JSON strings and only the last 5 entries are kept.

Have fun playing :-)


Screenshots

RoundActivity (First Activity)
![1_RoundActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/20ef601e-61f1-486c-9e04-7c5f804cdc46)


MainActivity (Second Activity)
![01_MainActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/987d664c-060d-4d95-aa1a-a922aeb58a51)
![03_MainActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/19b5dd0b-3154-499d-b1f0-70fa74b7e2c0)

ScoreActivity (Third Activity)
![01_ScoreActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/4f93e95e-2673-4aaa-84e9-488140604af5)
![02_ScoreActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/aa2719ae-e8a9-44c3-a38b-040c48067dae)
![03_ScoreActivity](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/f5753694-f123-475d-95bb-5275c7fbce9e)

ProfileActivity (Last Activity)
![Screenshot_20240629_203422](https://github.com/mubahilahmad/animal_guessing_game/assets/171627590/554d907d-6875-4a39-b33d-bf4482671cb9)
