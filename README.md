# Mood Tracker — Android UI prototype

**Kotlin · Android · XML layouts · Gradle**

> **Status: Incomplete learning prototype.** The navigation and interface skeleton exists, but persistent mood logging, history, statistics and settings are not implemented end to end.

## Overview

Mood Tracker explores a simple mobile interface for recording how a user feels and reviewing past entries. The repository currently focuses on basic Android screens and navigation concepts; it must **not** be presented as a complete wellbeing product.

## What is implemented in the source

- A home screen with four dynamically generated mood buttons: Happy, Neutral, Sad and Angry.
- A mood-selection Toast message.
- A button intended to open the mood logging screen.
- Navigation handlers for history, statistics and settings.
- XML layouts and Activity classes for those screens.

## What's missing or needs repair

- Selecting a mood **does not save it**; the handler only displays a Toast.
- The Save action calls an empty saveMood() implementation.
- History, statistics, reminder settings and policy handling are placeholders.
- The Android manifest currently declares **only MainActivity**. Other Activities referenced by navigation must be declared before those routes can work correctly.
- Build configuration enables Jetpack Compose, but the inspected Activity screens use classic XML/View-based UI. The architecture should be simplified or completed before claiming Compose-based features.
- Existing example test files are scaffolding, not evidence of complete test coverage.

## Technology

- **Language:** Kotlin
- **Platform:** Android (minimum SDK 24, target/compile SDK 34)
- **UI in the inspected screens:** AppCompat Activities and XML layouts
- **Build:** Kotlin Gradle DSL
- **Dependencies declared:** AndroidX, Material Components, Compose and MPAndroidChart; declaration alone does not imply the features are implemented.

## Local setup

1. Clone the repository and open it in Android Studio.
2. Install a compatible Android SDK and sync the Gradle project.
3. Launch on an emulator or device (API 24+).
4. Expect an incomplete workflow; navigation to non-manifest Activities needs fixing.

A successful clean build or device run has **not** been independently confirmed for this documentation pass.

## Suggested completion roadmap

1. Register screen Activities in the manifest and validate navigation.
2. Introduce a mood-entry model and local persistent storage (for example, Room).
3. Wire the Save action to actual storage and add input validation.
4. Populate history and statistics from saved entries.
5. Add unit and UI tests, error/empty states and accessibility checks.
6. Remove unused dependencies or complete the Compose migration.

## QA perspective

This project is useful for talking about **testability of incomplete software**: differentiate a UI mock-up from a working feature, record blockers, define acceptance criteria, and prioritise data integrity and accessibility before release.

See [Interview and QA notes](docs/INTERVIEW_PREP.md). All test cases there are proposals, not a verified execution report.

## Portfolio context

An intentionally honest record of an early Android project: useful for discussing Kotlin, mobile UI navigation, feature scope, and how a QA engineer would turn an unfinished prototype into a testable product.