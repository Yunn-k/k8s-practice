# 1. OpenJDK 기반 이미지 사용
FROM openjdk:21-jdk-slim

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. JAR 파일을 컨테이너 내부로 복사
COPY target/team1-0.0.1-SNAPSHOT.jar app.jar

# 4. 애플리케이션 실행
CMD ["java", "-jar", "app.jar"]
