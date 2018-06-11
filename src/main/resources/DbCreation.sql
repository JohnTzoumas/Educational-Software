--Chapter 0 questions
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



