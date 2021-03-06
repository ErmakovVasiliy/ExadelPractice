CREATE OR REPLACE VIEW "EMPLOYEE_VIEW" AS
  SELECT
    "USER".id,
    "USER".name,
    "USER".email,
    "USER".skype,
    "USER".role,
    "USER".telephone
    FROM "USER" INNER JOIN "EMPLOYEE" ON "USER".id = "EMPLOYEE".id;