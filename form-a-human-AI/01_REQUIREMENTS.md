# Form A: ReservationManager

Start with `00_START_HERE_PUBLIC.md`. This file is a plain-text copy of the task requirements for use while working with the Java project.

## What the component does

This component manages seat reservations against a fixed capacity. Creating a reservation reduces the number of available seats. Cancelling an active reservation returns those seats to the available capacity.

## Required behaviour

- The manager begins with a fixed seat capacity.
- A reservation must request a positive number of seats and cannot exceed the remaining capacity.
- Each reservation reference identifies at most one reservation.
- Cancelling an active reservation returns its seats to the available capacity.
- Cancelling an unknown reservation does not change the system state.
- A request may be submitted again if confirmation is not received. Repeating a request that has already completed must not change the system state a second time.
- The remaining capacity must always stay between zero and the manager's initial capacity.

## Files to use

1. Inspect `ReservationManager.java`, the main implementation under review.
2. Use `Reservation.java` and `ReservationStatus.java` to understand the supporting state.
3. Inspect and run `VisibleTestRunner.java`.
4. Put any tests you create in `ParticipantTestRunner.java`.
5. Record your final decision and evidence in `ReleaseDecision.md`.

## When you finish

Keep every Java file and test in this working folder, including tests that fail and any implementation changes you made. Complete `ReleaseDecision.md`, save and close all files, then compress the whole working folder into one ZIP file. Name it using the assigned system code, for example `A-HAI01.zip`; do not include your name.

Researcher-specific submission URL removed from the public copy.

During the original study, participants uploaded their completed folders to a researcher-controlled collection point.
