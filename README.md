# HorusRecruitmentExcercise
## Decyzje Implementacyjne
Tutaj nie byłem pewien czy CompositeBlock traktować w metodach jako jeden blok czy jako kontener przechowujący bloki. 
Podjąłemm decyzję, że potraktuję interface CopositeBlock jako kontener, więc metody wyszukujące bloki po określonych cechach sprawdzają bloki składające się na CompositeBlock, 
a metoda licząca bloki w ścianie zlicza te skłądające się na CompositeBlock.
