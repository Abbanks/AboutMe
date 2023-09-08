# AboutMe

## Project Overview
AboutMe features my Slack identity, incorporates my Slack profile picture, and includes an “Open GitHub” button. When pressed, this button should utilize a WebView component to redirect users to my GitHub profile within the application itself.

## Code Description
The `app` module contains app level and scaffolding classes that bind the rest of the codebase, such as `MainActivity`, `PersonalDetails()`.
- The `MainActivity ' contains 1 composable, and it has a verticalScroll modifier that scrolls the screen vertically. The UI is divided into one section:
- `PersonalDetails()` composable function: It implements an Image and a Button composable, which features my image, and a button that, when pressed, directs to a browser.

## Screenshots
![Screenshot](https://github.com/Abbanks/AboutMe/assets/51162743/937be5a4-784f-4adf-9903-588b25b93b31)

## Libraries used
I did not import a new library; I used the existing ones, which are:
- Jetpack Compose is faster, easier to use, and requires less code.
- Material Design is mostly used for theming, styling, and typography.
- Android KTX: Used to write more concise, idiomatic Kotlin code
  
## Live Demo
[<img src="https://user-images.githubusercontent.com/51162743/200105989-f3cb52e3-f43f-4b81-8de0-1e9377798a2d.png">](https://appetize.io/app/dvnqle65wjek6uimfbuxsf4wwa?device=pixel4&osVersion=11.0&scale=75)
