ALTER TABLE "USER" ADD COLUMN "birthdate" DATE;
ALTER TABLE "STUDENT" ADD COLUMN "current_project" TEXT;
ALTER TABLE "STUDENT" ADD COLUMN "team_lead_current_project" BIGINT REFERENCES "EMPLOYEE" (id);
ALTER TABLE "STUDENT" ADD COLUMN "project_manager_current_project" BIGINT REFERENCES "EMPLOYEE" (id);