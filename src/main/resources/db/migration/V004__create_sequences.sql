CREATE SEQUENCE IF NOT EXISTS public.conference_idconference_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.conference ALTER COLUMN idconference SET DEFAULT nextval('public.conference_idconference_seq');
ALTER SEQUENCE public.conference_idconference_seq OWNED BY public.conference.idconference;

CREATE SEQUENCE IF NOT EXISTS public.day_idday_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.day ALTER COLUMN idday SET DEFAULT nextval('public.day_idday_seq');
ALTER SEQUENCE public.day_idday_seq OWNED BY public.day.idday;

CREATE SEQUENCE IF NOT EXISTS public.day_conference_idconference_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.day ALTER COLUMN conference_idconference SET DEFAULT nextval('public.day_conference_idconference_seq');
ALTER SEQUENCE public.day_conference_idconference_seq OWNED BY public.day.conference_idconference;

CREATE SEQUENCE IF NOT EXISTS public.talks_idtalks_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.talks ALTER COLUMN idtalks SET DEFAULT nextval('public.talks_idtalks_seq');
ALTER SEQUENCE public.talks_idtalks_seq OWNED BY public.talks.idtalks;

CREATE SEQUENCE IF NOT EXISTS public.talks_conference_idconference_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.talks ALTER COLUMN conference_idconference SET DEFAULT nextval('public.talks_conference_idconference_seq');
ALTER SEQUENCE public.talks_conference_idconference_seq OWNED BY public.talks.conference_idconference;

CREATE SEQUENCE IF NOT EXISTS public.talks_day_idday_seq NO MINVALUE NO MAXVALUE NO CYCLE;
ALTER TABLE public.talks ALTER COLUMN day_idday SET DEFAULT nextval('public.talks_day_idday_seq');
ALTER SEQUENCE public.talks_day_idday_seq OWNED BY public.talks.day_idday;