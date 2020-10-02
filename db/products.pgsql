--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: productlist; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productlist (
    id bigint NOT NULL,
    price double precision,
    name character varying(255),
    upc integer
);


ALTER TABLE public.productlist OWNER TO postgres;

--
-- Name: productlist_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.productlist_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.productlist_id_seq OWNER TO postgres;

--
-- Name: productlist_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.productlist_id_seq OWNED BY public.productlist.id;


--
-- Name: productlist id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productlist ALTER COLUMN id SET DEFAULT nextval('public.productlist_id_seq'::regclass);


--
-- Data for Name: productlist; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.productlist (id, price, name, upc) FROM stdin;
1	175	Penguin-years 	20
2	825	Horseshoe 	5
\.


--
-- Name: productlist_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productlist_id_seq', 2, true);


--
-- Name: productlist productlist_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productlist
    ADD CONSTRAINT productlist_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

