# AI-assisted software verification: study materials

Public study-materials package accompanying the exploratory human–human and human–AI software verification study described in **Beyond Task Success in AI-Assisted Verification** (HUGS/ICSE 2027 submission draft). This archive contains the three **v3 participant package variants** supplied by the researchers, plus blank study questionnaire wording transcribed from the ethics protocol (Microsoft Forms). It does **not** contain participant submissions, responses, or interaction logs.

## Materials at a glance

| Folder | Condition | Java component | Role |
|---|---|---|---|
| [`form-a-student-student/`](form-a-student-student/) | Two students working together | `ReservationManager` | Phase A assisted verification |
| [`form-a-student-copilot/`](form-a-student-copilot/) | One student working with Copilot | `ReservationManager` | Phase A assisted verification |
| [`form-b-individual/`](form-b-individual/) | One student without collaborator support | `StudentPointsTracker` | Phase B independent diagnostic |

The Form A Java implementations, visible tests, decision template and CI report are **byte-for-byte identical** across the student–student and student–Copilot variants. Their participant-facing requirements and collaboration instructions differ. All three copies are included to preserve the condition-specific instructions rather than silently collapsing the packages into one.

## Blank research questionnaires

The [`questionnaires/`](questionnaires/) directory reproduces blank Microsoft Forms questionnaire items, response options and skip logic documented in **Section 6.2 of the study ethics application**: pre-task background/consent gating, private judgement **Snapshots 1 and 2** (one form administered twice), the **Form B individual judgement**, and post-task questionnaire. These are protocol transcriptions, **not** downloads of the underlying Microsoft Forms configuration or any student responses. Live Forms, consent records, participant IDs and personal information are intentionally excluded. See [`questionnaires/README.md`](questionnaires/README.md) for provenance and limitations.

## Study procedure (brief)

In **Phase A**, participants inspected the reservation-management implementation and recorded an individual pre-collaboration decision, rationale and confidence. They verified with a fellow student or Copilot, recorded a second private judgement, and then submitted a joint release decision and working files. In **Phase B**, each student independently verified a related but non-identical points-tracker implementation and recorded an individual decision, rationale and confidence. The two components share an **at-most-once** requirement (repeating a completed operation must not apply its effect twice) but implement it through different program domains.

Each program package includes the original Java implementation and supplied visible tests, an initially empty participant-test runner, CI evidence, a requirements document and an empty release-decision template. Researchers' hidden diagnostic tests were **not part of the participant packages** and were **not supplied for this repository**. The paper's documented researcher-only scenarios are described below for transparency; **we do not present reconstructed tests as original hidden-oracle code**.

## Compile and run

Requires **JDK 11 or newer**, owing to `String.isBlank()` in Form B. In any one package directory:

```bash
javac *.java
java VisibleTestRunner
java ParticipantTestRunner
```

Each unmodified package's visible runner reports **8/8 passing tests**. `ParticipantTestRunner` is an intentionally unpopulated scaffold and reports zero tests until extended. Use a fresh working copy for each condition. The provided implementation is the *object under review*, not a corrected release-ready implementation.

## Documented omitted test cases

The following are researcher-only cases described in the manuscript; **they were not in the participant-visible test suites**:

- **Form A / `ReservationManager`**: reserve 3 of 10 seats, then cancel the same reservation twice. Expected capacity remains **10**; the supplied implementation reaches **13**.
- **Form B / `StudentPointsTracker`**: record a three-point activity, then resubmit the same record ID. Expected points remain **3**; the supplied implementation reaches **6**, despite storing only one record.

The released participant-visible tests exercise some duplicate or cancellation behaviours but do not assert these repeated-operation state-invariants. The participant materials should therefore not be interpreted as containing all verification oracles.

## Publication and privacy notes

**This public archive is a sanitised derivative of the original v3 packages**, not an exact archival copy of the participant handouts. The `.java`, `ci_report.txt`, `ParticipantTestRunner.java`, `VisibleTestRunner.java`, and `ReleaseDecision.md` files are preserved **unchanged**. The `01_REQUIREMENTS.md` copies have researcher-specific upload links removed and their introduction updated to point to the public guide. The original `00_START_HERE.docx` guides are represented by `00_START_HERE_PUBLIC.md` to retain task procedures without publishing active participant survey URLs, upload endpoints or internal document metadata. See [`SOURCE_INTEGRITY.md`](SOURCE_INTEGRITY.md) for checksums and per-file change status.

No student answers, private interaction records, identifying participant data, active Microsoft Forms submission endpoints, or researcher-specific SharePoint upload links are distributed. Anonymised data are not included in this package. Permission/licensing for subsequent reuse should be established with the study authors; no open-source licence is asserted here.

For stable citation, use a pinned commit or tagged release URL rather than a mutable default branch.
