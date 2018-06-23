--Chapter 0 Vocabulary questions
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'The author died after a ______ illness.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I asked an old couple for directions, but _____ of them knew where the cinema was.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I’m not feeling well. I’d rather _______ in tonight.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I’m afraid I _____ used to working in an open-plan office.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'The bathroom floor is all wet. Who ______ a shower?', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'Our company receives hundreds of ______ emails every day.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'You are taking this very lightly, ______ your mother is dead serious.', 0);
INSERT INTO public.question (id, question_text, chapter_id) VALUES (default, 'I got a _____ box for my birthday.', 0);
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'We _____ watch Star Trek with my brother every evening when we were children.', 0);
INSERT INTO public.question (id, question_text, chapter_id) VALUES (default,
                                                                    'The guest room is quite small, but there should be enough space for you there. You only have a few ____ and pieces.',
                                                                    0);

--Question 1 The author died after a ______ illness.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'procuring', false, 1);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'profuse', true, 1);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'protracted', false, 1);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'prolapsed', false, 1);

--Question 2 I asked an old couple for directions, but _____ of them knew where the cinema was.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'all', false, 2);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'both', false, 2);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'none', false, 2);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'neither', true, 2);

--Question 3 I’m not feeling well. I’d rather _______ in tonight.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'stay', true, 3);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'to stay', false, 3);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'you to stay', false, 3);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'staying', false, 3);

--Question 4 I’m afraid I _____ used to working in an open-plan office.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'haven''t ever', false, 4);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'haven''t', false, 4);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'haven''t got', true, 4);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'have', false, 4);

--Question 5 The bathroom floor is all wet. Who ______ a shower?
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'had', false, 5);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'has been having', true, 5);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'had had', false, 5);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'had been having', false, 5);

--Question 6 Our company receives hundreds of ______ emails every day.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'unstated', false, 6);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'unsolicited', true, 6);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'unrequited', false, 6);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'unkempt', false, 6);

--Question 7 You are taking this very lightly, ______ your mother is dead serious.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'whence', false, 7);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'since', false, 7);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'as', false, 7);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'whereas', true, 7);

--Question 8 I got a _____ box for my birthday.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'white small wooden', false, 8);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'small white wooden', false, 8);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'small wooden white', true, 8);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'wooden small white', false, 8);

--Question 9 We _____ watch Star Trek with my brother every evening when we were children.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'had', false, 9);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'would', true, 9);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'were used to', false, 9);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'use to', false, 9);

--Question 10 The guest room is quite small, but there should be enough space for you there. You only have a few ____ and pieces.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'bits', false, 10);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'clothes', true, 10);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'stuff', false, 10);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'books', false, 10);

--Chapter 1 Grammar questions
INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'Nobody should think they''re above _____ .', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I’m not sure if I shut down the computer. I can’t really remember _______ it down.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'We _____ watch Star Trek with my brother every evening when we were children.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I know I was supposed to stay serious, but I couldn''t help ', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'The author died after a ______ illness.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'Do you mind if I open the window?’ ’I’d rather you ______.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'I asked an old couple for directions, but _____ of them knew where the cinema was.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'If you ______ to see Mary, could you say hello to her for me?', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'Increasing currency ______ is making exchange rates more volatile.', 1);

INSERT INTO public.question (id, question_text, chapter_id)
VALUES (default, 'Seldom _____ anything funnier.', 1);


--Question 1 Nobody should think they're above _____ .
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'approach', false, 11);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'reproach', true, 11);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'blame', false, 11);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'responsibility', false, 11);

--Question 2 I’m not sure if I shut down the computer. I can’t really remember _______ it down.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'have shut', false, 12);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'shutting', true, 12);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'to shut', false, 12);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'I shut', false, 12);

--Question 3 We _____ watch Star Trek with my brother every evening when we were children.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'had', true, 13);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'would', false, 13);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'were used to', false, 13);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'use to', false, 13);

--Question 4 The author died after a ______ illness.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'to laugh', false, 14);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'laughed', false, 14);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'with laughing', false, 14);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'laughing', true, 14);

--Question 5 'We _____ watch Star Trek with my brother every evening when we were children.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'procuring', false, 15);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'profuse', true, 15);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'protracted', false, 15);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'prolapsed', false, 15);

--Question 6 Do you mind if I open the window?’ ’I’d rather you ______.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'don''t', false, 16);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'won''t', false, 16);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'do', false, 16);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'didn''t', true, 16);

--Question 7 I asked an old couple for directions, but _____ of them knew where the cinema was.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'all', false, 17);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'both', false, 17);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'none', false, 17);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'neither', true, 17);

--Question 8 If you ______ to see Mary, could you say hello to her for me?
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'likely', false, 18);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'possibly', false, 18);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'happen', true, 18);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'might', false, 18);

--Question 9 Increasing currency ______ is making exchange rates more volatile.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'intervention', false, 19);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'speculation', true, 19);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'laundering', false, 19);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'endorsment', false, 19);

--Question 10 Seldom _____ anything funnier.
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'I have seen', false, 20);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'I see', false, 20);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'have I seen', true, 20);
INSERT INTO public.answer (id, answer_text, is_correct, question_id) VALUES (default, 'I saw', false, 20);




