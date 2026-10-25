# Interview preparation and QA review

> These are source-review notes and **suggested** test scenarios. They do not represent executed test cases, successful builds or approved production requirements.

## Project in one sentence

Incomplete Kotlin Android mood-entry UI prototype.

## Technical interview questions and grounded answers

### 1. What currently works?

The main screen renders mood choices with Toast feedback and contains navigation intents. This is not proof that the downstream screens work.

### 2. What blocks navigation?

Only MainActivity is declared in the inspected AndroidManifest.xml, although other Activity classes are launched by intent.

### 3. Does it store moods?

No persistence is implemented in the inspected saveMood() function; the mood buttons display feedback without saving an entry.

### 4. Does it use Jetpack Compose?

The Gradle file enables Compose dependencies, but the inspected Activity implementations use XML layouts and AppCompat; dependencies are not proof of deployed Compose screens.

### 5. How would you prioritise improvements?

Fix manifest/navigation blockers first, add a persistence model and real save flow, then history/statistics, tests and accessibility verification.

## Suggested functional and accessibility test cases

| ID | Scenario | Expected / verification objective |
| --- | --- | --- |
| NAV-01 | Open each bottom-navigation destination | Activity starts without crash, or defect is recorded against missing manifest registration |
| MOOD-01 | Choose every mood | Choice is perceivable to screen-reader users and matches visible feedback |
| SAVE-01 | Tap Save after entering data | A stored entry can be recovered after restart; currently unimplemented |
| EMPTY-01 | Attempt empty/invalid entry | User gets clear validation, no corrupt record persists |
| HIST-01 | Open history with zero entries | Appropriate accessible empty state is displayed once implemented |
| A11Y-01 | Enable TalkBack, font scaling and rotation | All controls retain meaning and do not clip or lose state |

## Limitations to disclose

Do not present this as a finished mood-tracking product or a working chart/dashboard. The current source mainly demonstrates a UI/navigation foundation.

## How to discuss the project

Explain what the code currently contains, which components you actually developed, the difference between intent and implementation, one defect or risk you identified, and how you would validate a fix. Avoid claiming tests have passed unless you can provide reproducible evidence.

## Suggested next improvements

- Verify a clean checkout/build with a documented environment.
- Record reproducible bugs or missing features as GitHub Issues.
- Add evidence-backed screenshots and a short demo only after confirming they match the actual project.
- Add focused automated tests where the architecture makes them worthwhile; keep manual exploratory and accessibility testing visible.
