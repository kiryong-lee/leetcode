# LeetCode Java Workspace

리트코드 문제를 자바로 정리하고 로컬에서 테스트하기 위한 기본 구조입니다.

## 구조

```text
leetcode/
├── build.gradle
├── settings.gradle
├── src
│   ├── main
│   │   └── java
│   │       └── leetcode
│   │           ├── common
│   │           ├── problems
│   │           └── template
│   └── test
│       └── java
│           └── leetcode
│               └── problems
└── test
```

## 패키지 규칙

- 문제 코드는 `leetcode.problems._0001_two_sum` 같은 패키지에 둡니다.
- 패키지명은 `_{문제번호}_{문제이름}` 형식을 추천합니다.
- 공통으로 쓰는 자료구조는 `leetcode.common`에 둡니다.

## 새 문제 추가

1. `src/main/java/leetcode/template/ProblemTemplate.java`를 참고해 새 패키지를 만듭니다.
2. 각 문제 폴더에 `Solution.java`를 작성합니다.
3. 필요하면 `src/test/java` 아래에 같은 패키지 경로로 테스트를 추가합니다.

예시:

```text
src/main/java/leetcode/problems/_0020_valid_parentheses/Solution.java
src/test/java/leetcode/problems/_0020_valid_parentheses/SolutionTest.java
```

## 실행

- 로컬에 Gradle이 설치되어 있으면: `gradle test`
- Gradle Wrapper를 추가한 뒤에는: `./gradlew test`

## 메모

- 리트코드 제출 시에는 `package` 선언과 테스트 코드를 제거하고 `Solution` 클래스만 제출하면 됩니다.
- `test` 파일은 기존 리포 파일이라 그대로 유지했습니다.

