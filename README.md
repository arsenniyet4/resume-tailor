# Resume Tailor

A web app that tailors your resume to a specific job posting.

You fill in your profile once: education, projects with bullet points and tags, skills, and a few summary variants. Then you paste a job description and get a one-page, ATS-friendly PDF built from the parts of your profile that best match the posting.

**Core principle:** the app never invents experience. It only selects, reorders, and fills in content you wrote yourself.

## Status

Work in progress. The MVP is under active development.

- [x] Project setup
- [ ] PostgreSQL + Flyway migrations
- [ ] Sign in with Google
- [ ] Profile editor
- [ ] Job posting → tailored PDF

## Tech stack

- **Backend:** Java 25, Spring Boot 4, Spring Data JPA, Spring Security (OAuth2 / Google)
- **Database:** PostgreSQL, Flyway
- **PDF:** OpenHTMLtoPDF
- **Frontend:** React, TypeScript, Vite, Tailwind
- **Testing:** JUnit 5, MockMvc, Testcontainers
- **CI/CD & hosting:** GitHub Actions, Google Cloud Run, Neon

## Running locally

Requirements: JDK 25, Docker.

```bash
./mvnw spring-boot:run
```

*Local database setup coming soon.*
