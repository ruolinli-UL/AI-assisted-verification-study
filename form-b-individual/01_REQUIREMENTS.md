# Form B: StudentPointsTracker

Start with `00_START_HERE_PUBLIC.md`. This file is a plain-text copy of the task requirements.

## What the component does

An online learning platform gives students points for completing activities. Each points record has a unique record ID. The tracker stores these records and maintains each student's total points.

## Required behaviour

- The tracker begins with no stored records and zero points for every student.
- A valid record has a non-blank record ID, a non-blank student ID and a positive number of points.
- Each record ID identifies at most one stored record.
- Recording a new record adds its points to the named student's total.
- Invalid records do not change the stored records or any student's total.
- A record may be submitted again if confirmation is not received. Submitting an existing record again must not add its points a second time.
- A student's total must always equal the sum of the points from their distinct accepted records.

## Files to use

1. Inspect `StudentPointsTracker.java`, the main implementation under review.
2. Use `PointsRecord.java` to understand the stored data.
3. Inspect and run `VisibleTestRunner.java`.
4. Put any tests you create in `ParticipantTestRunner.java`.
5. Record your final decision and evidence in `ReleaseDecision.md`.

## When you finish

Keep every Java file and test in this working folder, including tests that fail and any implementation changes you made. Complete `ReleaseDecision.md`, save and close all files, then compress the whole working folder into one ZIP file. Name it using your assigned participant code, for example `B-P01.zip`; do not include your name.

Researcher-specific submission URL removed from the public copy.

During the original study, participants uploaded their completed folders to a researcher-controlled collection point.
