# rise-of-cultures-wonder-synergy
Calculates the highest wonder bonus synergies for Rise of Cultures.
Players can choose 8 wonders of the world in groups of 4 'capital city' wonders and 4 'allied cultures' wonders.
Wonders have self bonuses that are always active and synergy bonuses that are only active when other wonders of a specific type are chosen.
Choosing wonders that boost each other will significantly improve your economy, military and research.
Of course, the actual best combination of wonders for you depends on what you need, the wonders you have unlocked, and their upgrade levels.

Let us assume that all wonders can be chosen, and are of equal level, which combination of wonders offers the highest number of bonuses?
The answer can be calculated for different scenarios:
* Overall - a grand total of bonuses across economy, military and research
* Economy - bonuses for workers and production, disregarding military and research
* Military - bonuses for fighting battles, disregarding economy and research
* Research - bonuses generating research, disregarding economy and military

A few notes:
* Mystery Chests with food and gold which can include a Mercenary Commander counts as Economy
* Mystery Chests with food, gold or goods which can include Research Points counts as Research
* Increase of production speed of soldiers counts as Economy (since it frees up workers)

# Bad bonuses
The military bonuses of Sherwood Forest and Sayil Palace are questionable.
Ranged units should not get hit and bastion units (e.g. Alexander's palisades) play an insignificant role.
Therefore, another set of results is calculated, after removing the following bonuses:

Sherwood Forest
* Boosts the Hit Points of all of your Ranged Units
* Boosts the Hit Points of all of your Ranged Units by 2.0% extra per every other active Fortress

Sayil Palace
* Boosts the Hit Points of all of your Bastion Units
* Boosts the Damage of all of your Bastion Units by 2.0% extra per every other active Fortress

## Results (bad bonuses included)

Highest overall bonuses (48) for:

| Economy | Military | Research | Wonder 1        | Wonder 2  | Wonder 3         | Wonder 4        | Wonder 5   | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|-----------------|-----------|------------------|-----------------|------------|-----------------|------------|--------------|
| 9       | 28       | 11       | Hanging Gardens | Colosseum | Palace of Aachen | Sherwood Forest | Abu Simbel | Terracotta Army | Great Wall | Sayil Palace |

Highest economy bonuses (29) for:

| Economy | Military | Research | Wonder 1          | Wonder 2         | Wonder 3                 | Wonder 4                 | Wonder 5       | Wonder 6        | Wonder 7       | Wonder 8     |
|---------|----------|----------|-------------------|------------------|--------------------------|--------------------------|----------------|-----------------|----------------|--------------|
| 29      | 6        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 5        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 4        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 3        | 1        | Temple of Artemis | Hanging Gardens  | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 4        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 4        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 3        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 2        | 7        | Stonehenge        | Hanging Gardens  | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 3        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 2        | 2        | Hanging Gardens   | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |

Highest military bonuses (35) for:

| Economy | Military | Research | Wonder 1       | Wonder 2  | Wonder 3         | Wonder 4        | Wonder 5     | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|----------------|-----------|------------------|-----------------|--------------|-----------------|------------|--------------|
| 5       | 35       | 7        | Statue of Zeus | Colosseum | Palace of Aachen | Sherwood Forest | Great Sphinx | Terracotta Army | Great Wall | Sayil Palace |

Highest research bonuses (13) for:

| Economy | Military | Research | Wonder 1   | Wonder 2         | Wonder 3         | Wonder 4         | Wonder 5   | Wonder 6       | Wonder 7   | Wonder 8     |
|---------|----------|----------|------------|------------------|------------------|------------------|------------|----------------|------------|--------------|
| 13      | 8        | 13       | Stonehenge | Tomb of Mausolus | Hagia Sophia     | Palace of Aachen | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 12      | 8        | 13       | Stonehenge | Tomb of Mausolus | Hagia Sophia     | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 10      | 14       | 13       | Stonehenge | Tomb of Mausolus | Palace of Aachen | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 8       | 14       | 13       | Stonehenge | Hagia Sophia     | Palace of Aachen | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |

## Results (bad bonuses removed)

Highest overall bonuses (43) for:

| Economy | Military | Research | Wonder 1          | Wonder 2   | Wonder 3         | Wonder 4                 | Wonder 5       | Wonder 6     | Wonder 7       | Wonder 8     |
|---------|----------|----------|-------------------|------------|------------------|--------------------------|----------------|--------------|----------------|--------------|
| 29      | 6        | 8        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Lighthouse of Alexandria | Cheops Pyramid | Great Sphinx | Forbidden City | Chichen Itza |
| 28      | 6        | 9        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Hagia Sophia             | Cheops Pyramid | Great Sphinx | Forbidden City | Chichen Itza |

Highest economy bonuses (29) for:

| Economy | Military | Research | Wonder 1          | Wonder 2         | Wonder 3                 | Wonder 4                 | Wonder 5       | Wonder 6        | Wonder 7       | Wonder 8     |
|---------|----------|----------|-------------------|------------------|--------------------------|--------------------------|----------------|-----------------|----------------|--------------|
| 29      | 6        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 5        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 3        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 2        | 1        | Temple of Artemis | Hanging Gardens  | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 4        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 4        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 2        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 1        | 7        | Stonehenge        | Hanging Gardens  | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 3        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Great Sphinx    | Forbidden City | Chichen Itza |
| 29      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Terracotta Army | Forbidden City | Chichen Itza |
| 29      | 1        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |
| 29      | 1        | 2        | Hanging Gardens   | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City  | Sayil Palace   | Chichen Itza |

Highest military bonuses (25) for:

| Economy | Military | Research | Wonder 1          | Wonder 2       | Wonder 3  | Wonder 4         | Wonder 5     | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|-------------------|----------------|-----------|------------------|--------------|-----------------|------------|--------------|
| 6       | 25       | 5        | Temple of Artemis | Statue of Zeus | Colosseum | Palace of Aachen | Great Sphinx | Terracotta Army | Great Wall | Sayil Palace |
| 6       | 25       | 4        | Temple of Artemis | Statue of Zeus | Colosseum | Palace of Aachen | Great Sphinx | Terracotta Army | Great Wall | Chichen Itza |

Highest research bonuses (13) for:

| Economy | Military | Research | Wonder 1   | Wonder 2         | Wonder 3         | Wonder 4         | Wonder 5   | Wonder 6       | Wonder 7   | Wonder 8     |
|---------|----------|----------|------------|------------------|------------------|------------------|------------|----------------|------------|--------------|
| 13      | 5        | 13       | Stonehenge | Tomb of Mausolus | Hagia Sophia     | Palace of Aachen | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 12      | 2        | 13       | Stonehenge | Tomb of Mausolus | Hagia Sophia     | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 10      | 6        | 13       | Stonehenge | Tomb of Mausolus | Palace of Aachen | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 8       | 6        | 13       | Stonehenge | Hagia Sophia     | Palace of Aachen | Sherwood Forest  | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |

