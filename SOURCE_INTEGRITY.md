# Source integrity and sanitisation log

All source ZIP archives were supplied by the study researchers as v3 participant packages. SHA-256 of each original ZIP:

- `Study1_Form_A_Student_Student_Participant_Package_v3 (1).zip`: `3310a624cce120c6cff4c42330db29969f4f9e2362bebf1707bd02cdf8e7e3c1`
- `Study1_Form_A_Student_Copilot_Participant_Package_v3.zip`: `91950a50d87dcaa14ca689ad097d343cd438385556cf95bdb6af8144cc6b92a8`
- `Study1_Form_B_Individual_Participant_Package_v3.zip`: `90dc1ffc9449bcbb11c5326d579110a76dd8f91c13f0e51703b8cfce07c818ca`

The Java, visible tests, CI reports and empty release-decision files were copied unchanged. Instructions and requirements were sanitised for public distribution, only to remove researcher-specific operational links, convert Word task guides into Markdown, and update their filenames. **Do not treat public instructional copies as byte-identical to original participant handouts.**

| Folder | Original file | Treatment | Original SHA-256 | Public SHA-256 |
|---|---|---|---|---|
| `form-a-student-student` | `00_START_HERE.docx → 00_START_HERE_PUBLIC.md` | converted/sanitised: Word metadata, survey and upload links omitted | `879b185a3a2e46a048708d02e5c9115843179d55c36b646997ed086ae7da44c3` | `e96ac9c582140d770efae01fe979d49da973b23fcc21d77f8754e88a51d630bb` |
| `form-a-student-student` | `01_REQUIREMENTS.md` | sanitised: participant upload URL removed; guide filename updated | `343a34500d9857bba073184474e929ed0de4b91e8ed0f9b34cc8cbdc0e34d500` | `7e899a3bf0b667e1d8c5553a12b95271e24d81c1caf9815b3ef241edcb65e07a` |
| `form-a-student-student` | `ci_report.txt` | unmodified | `02eabd9657f1214a1ed5af925db1b2cff56c0a6bd3d3c5d4a37dcbc2017294b2` | `02eabd9657f1214a1ed5af925db1b2cff56c0a6bd3d3c5d4a37dcbc2017294b2` |
| `form-a-student-student` | `ParticipantTestRunner.java` | unmodified | `91089c35e583f617f89525a35fbdf225aefc56fe51842fbf07f31ed4dcd6ef72` | `91089c35e583f617f89525a35fbdf225aefc56fe51842fbf07f31ed4dcd6ef72` |
| `form-a-student-student` | `ReleaseDecision.md` | unmodified | `be91ed3d6ebb6af0e11e134d5a2f2414d88bcc9c258de39fbe75941f1ca7dce7` | `be91ed3d6ebb6af0e11e134d5a2f2414d88bcc9c258de39fbe75941f1ca7dce7` |
| `form-a-student-student` | `Reservation.java` | unmodified | `869a0f1ddb22e28c7820e17a34414c35817b9ac7894048e3dac7fc56816ed811` | `869a0f1ddb22e28c7820e17a34414c35817b9ac7894048e3dac7fc56816ed811` |
| `form-a-student-student` | `ReservationManager.java` | unmodified | `c335221dce30b999d7ac6f43171365745970ecff362a3607e7cc58af57601836` | `c335221dce30b999d7ac6f43171365745970ecff362a3607e7cc58af57601836` |
| `form-a-student-student` | `ReservationStatus.java` | unmodified | `a2cf292a4f7f56dff4ae336ff10f3bc1b5e62bb90c7d44f3e0d307765f80ed59` | `a2cf292a4f7f56dff4ae336ff10f3bc1b5e62bb90c7d44f3e0d307765f80ed59` |
| `form-a-student-student` | `VisibleTestRunner.java` | unmodified | `d82a0cc6b951fd96e47deadafb60e1e6551d843d57ae7c58f30204c1c9e22bef` | `d82a0cc6b951fd96e47deadafb60e1e6551d843d57ae7c58f30204c1c9e22bef` |
| `form-a-student-copilot` | `00_START_HERE.docx → 00_START_HERE_PUBLIC.md` | converted/sanitised: Word metadata, survey and upload links omitted | `84b0e92a814c5ac585c1e9c25be3ddecb8862b2c39ddfbcedfc3e70ed8cf9091` | `f36e08c850c11871cdc042799f30d467b14b37ed5df4fd45bf178a6a0b5b4d25` |
| `form-a-student-copilot` | `01_REQUIREMENTS.md` | sanitised: participant upload URL removed; guide filename updated | `046e8d9a08af79975548b7f0d66712e9a04dec80d5dd09df8983ad8c2d45bf79` | `541134fcc3df0cda56c9efe3b9f0b1c5804fe1075ac89af1043acd373ccf5ace` |
| `form-a-student-copilot` | `ci_report.txt` | unmodified | `02eabd9657f1214a1ed5af925db1b2cff56c0a6bd3d3c5d4a37dcbc2017294b2` | `02eabd9657f1214a1ed5af925db1b2cff56c0a6bd3d3c5d4a37dcbc2017294b2` |
| `form-a-student-copilot` | `ParticipantTestRunner.java` | unmodified | `91089c35e583f617f89525a35fbdf225aefc56fe51842fbf07f31ed4dcd6ef72` | `91089c35e583f617f89525a35fbdf225aefc56fe51842fbf07f31ed4dcd6ef72` |
| `form-a-student-copilot` | `ReleaseDecision.md` | unmodified | `be91ed3d6ebb6af0e11e134d5a2f2414d88bcc9c258de39fbe75941f1ca7dce7` | `be91ed3d6ebb6af0e11e134d5a2f2414d88bcc9c258de39fbe75941f1ca7dce7` |
| `form-a-student-copilot` | `Reservation.java` | unmodified | `869a0f1ddb22e28c7820e17a34414c35817b9ac7894048e3dac7fc56816ed811` | `869a0f1ddb22e28c7820e17a34414c35817b9ac7894048e3dac7fc56816ed811` |
| `form-a-student-copilot` | `ReservationManager.java` | unmodified | `c335221dce30b999d7ac6f43171365745970ecff362a3607e7cc58af57601836` | `c335221dce30b999d7ac6f43171365745970ecff362a3607e7cc58af57601836` |
| `form-a-student-copilot` | `ReservationStatus.java` | unmodified | `a2cf292a4f7f56dff4ae336ff10f3bc1b5e62bb90c7d44f3e0d307765f80ed59` | `a2cf292a4f7f56dff4ae336ff10f3bc1b5e62bb90c7d44f3e0d307765f80ed59` |
| `form-a-student-copilot` | `VisibleTestRunner.java` | unmodified | `d82a0cc6b951fd96e47deadafb60e1e6551d843d57ae7c58f30204c1c9e22bef` | `d82a0cc6b951fd96e47deadafb60e1e6551d843d57ae7c58f30204c1c9e22bef` |
| `form-b-individual` | `00_START_HERE.docx → 00_START_HERE_PUBLIC.md` | converted/sanitised: Word metadata, survey and upload links omitted | `4ffdc6a49216d563bd99959f2042ca3084a7ed44db56dfff73610adc20a16db5` | `f1002d7a5b6f89b22769f9d30b6a2616bd9b106aa1a0e1b1b8ecb25c3a2082cd` |
| `form-b-individual` | `01_REQUIREMENTS.md` | sanitised: participant upload URL removed; guide filename updated | `7e43c01298817728e47172a71453997474504da2488d4e39c096b322b0e9d6c8` | `6941e9bde45c0df1d1c4f8670fcfeb863052834be0864e2c4e12924573e22d32` |
| `form-b-individual` | `ci_report.txt` | unmodified | `36c7af7d4e479aca57a3b7b21347b26f9d37386d1eb4cd3d4c05bd26a4fd549c` | `36c7af7d4e479aca57a3b7b21347b26f9d37386d1eb4cd3d4c05bd26a4fd549c` |
| `form-b-individual` | `ParticipantTestRunner.java` | unmodified | `8ca6abf96eef5fecf7612fff5f7410547d0efea34195daa1a890d08ab30a6900` | `8ca6abf96eef5fecf7612fff5f7410547d0efea34195daa1a890d08ab30a6900` |
| `form-b-individual` | `PointsRecord.java` | unmodified | `67131dbdf844a7cab5a6f79448ee4c58decee19b5e6be44cd949dfe93817d90d` | `67131dbdf844a7cab5a6f79448ee4c58decee19b5e6be44cd949dfe93817d90d` |
| `form-b-individual` | `ReleaseDecision.md` | unmodified | `59e192b0047fce94665178db92ad6ede60533a2c08b16c31c5234086c21d960f` | `59e192b0047fce94665178db92ad6ede60533a2c08b16c31c5234086c21d960f` |
| `form-b-individual` | `StudentPointsTracker.java` | unmodified | `8e89ae9bf7486a3d7e38f528d83a7d4c99a2d5715b7d520162cf6c0b49d4f05a` | `8e89ae9bf7486a3d7e38f528d83a7d4c99a2d5715b7d520162cf6c0b49d4f05a` |
| `form-b-individual` | `VisibleTestRunner.java` | unmodified | `42edcbf983c0a38f57e5f90015c06a4081bee1848a14249ec491a284ad5d1f3e` | `42edcbf983c0a38f57e5f90015c06a4081bee1848a14249ec491a284ad5d1f3e` |


## Addition: blank questionnaire documentation

The `questionnaires/*.md` files were newly transcribed from Section 6.2 of the supplied ethics-application document (`2026_09_07_S&E Beyond Task Success_revised.docx`, pp. 19–24). They are **not** from the three ZIP source packages and are **not** Microsoft Forms exports. They reproduce instrument questions/options and documented branching, but omit live form URLs and participant information-sheet body. No participant-response data have been included.
