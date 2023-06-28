# Optimal wonder synergy in Rise of Cultures
Calculates the highest synergy for wonder combinations in Rise of Cultures.
Players can choose 8 wonders of the world in groups of 4 'capital city' wonders and 4 'allied cultures' wonders.
Wonders have self bonuses that are always active and synergy bonuses that are only active when other wonders of a specific type are chosen.
Choosing wonders that boost each other will significantly improve your economy, military and research.
Of course, the actual best combination of wonders for _you_ depends on your culture's needs, the wonders you have unlocked, and their upgrade levels.

## Highest bonuses... for what?
For now, let us assume that all wonders can be chosen, and are of equal level.
Which combination of wonders offers the highest number of bonuses?
The answer should be calculated for different scenarios to suit your needs:
* Overall - a combined total of bonuses across economy, military and research
* Economy - bonuses for workers and production, disregarding military and research
* Military - bonuses for fighting battles, disregarding economy and research
* Research - bonuses generating research, disregarding economy and military

## Notes
* Mystery Chests with food and gold which can include a Mercenary Commander counts as Economy
* Mystery Chests with food, gold or goods which can include Research Points counts as Research
* Increase of production speed of soldiers counts as Economy (since it frees up workers)
* Colossus of Rhodes' more Gears for donations counts as Research (since you have to spend fewer Research Points for the same amount of Gears)
* Colossus of Rhodes' daily production of a Treasure Hunt Attempt is ignored
* Yggdrasil building customization chest that may boost anything counts as Economy

## Bad bonuses
* The military bonuses of Sherwood Forest and Sayil Palace are questionable. Ranged units should not get hit and bastion units (e.g. Alexander's Bastion, King Pakal's Deadly Walls) only play a limited role. Therefore, another set of results is calculated, after removing the following 'bad bonuses':
  * Sherwood Forest
    * Boosts the Hit Points of all of your Ranged Units
    * Boosts the Hit Points of all of your Ranged Units by 2.0% extra per every other active Fortress 
  * Sayil Palace
    * Boosts the Hit Points of all of your Bastion Units
    * Boosts the Damage of all of your Bastion Units by 2.0% extra per every other active Fortress

## Results (including 'bad bonuses')
### Highest overall combined bonuses (50) for:

| Economy | Military | Research | Wonder 1  | Wonder 2         | Wonder 3        | Wonder 4            | Wonder 5   | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|-----------|------------------|-----------------|---------------------|------------|-----------------|------------|--------------|
| 4       | 34       | 12       | Colosseum | Palace of Aachen | Sherwood Forest | Cité de Carcassonne | Abu Simbel | Terracotta Army | Great Wall | Sayil Palace |

### Highest economy bonus (31) for:

| Economy | Military | Research | Wonder 1          | Wonder 2         | Wonder 3                 | Wonder 4                 | Wonder 5       | Wonder 6       | Wonder 7     | Wonder 8 |
|---------|----------|----------|-------------------|------------------|--------------------------|--------------------------|----------------|----------------|--------------|----------|
| 31      | 4        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 3        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |

### Highest military bonus (36) for:

| Economy | Military | Research | Wonder 1       | Wonder 2         | Wonder 3         | Wonder 4            | Wonder 5     | Wonder 6        | Wonder 7     | Wonder 8     |
|---------|----------|----------|----------------|------------------|------------------|---------------------|--------------|-----------------|--------------|--------------|
| 7       | 36       | 1        | Statue of Zeus | Colosseum        | Palace of Aachen | Sherwood Forest     | Great Sphinx | Terracotta Army | Sayil Palace | Yggdrasil    |
| 5       | 36       | 8        | Colosseum      | Palace of Aachen | Sherwood Forest  | Cité de Carcassonne | Great Sphinx | Terracotta Army | Great Wall   | Sayil Palace |

### Highest research bonus (15) for:

| Economy | Military | Research | Wonder 1         | Wonder 2            | Wonder 3              | Wonder 4              | Wonder 5   | Wonder 6       | Wonder 7     | Wonder 8     |
|---------|----------|----------|------------------|---------------------|-----------------------|-----------------------|------------|----------------|--------------|--------------|
| 11      | 8        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 11      | 4        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 8       | 8        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 11      | 8        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 12      | 4        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 7       | 8        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 8        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 9       | 4        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 8        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 7       | 14       | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 8       | 8        | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 14       | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 6       | 12       | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 7       | 7        | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 4       | 12       | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 7       | 11       | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 8       | 6        | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 11       | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 9       | 14       | 15       | Hanging Gardens  | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 12       | 15       | Hanging Gardens  | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 11       | 15       | Hanging Gardens  | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 4       | 19       | 15       | Palace of Aachen | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 5       | 18       | 15       | Palace of Aachen | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 4       | 15       | 15       | Sherwood Forest  | Cité de Carcassonne | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |

## Results (after removing 'bad bonuses')
### Highest overall combined bonuses (45) for:

| Economy | Military | Research | Wonder 1          | Wonder 2   | Wonder 3         | Wonder 4              | Wonder 5       | Wonder 6       | Wonder 7       | Wonder 8  |
|---------|----------|----------|-------------------|------------|------------------|-----------------------|----------------|----------------|----------------|-----------|
| 25      | 9        | 11       | Temple of Artemis | Stonehenge | Tomb of Mausolus | Leaning Tower of Pisa | Cheops Pyramid | Great Sphinx   | Forbidden City | Yggdrasil |
| 28      | 5        | 12       | Temple of Artemis | Stonehenge | Tomb of Mausolus | Leaning Tower of Pisa | Cheops Pyramid | Forbidden City | Chichen Itza   | Yggdrasil |

### Highest economy bonus (31) for:

| Economy | Military | Research | Wonder 1          | Wonder 2         | Wonder 3                 | Wonder 4                 | Wonder 5       | Wonder 6       | Wonder 7     | Wonder 8 |
|---------|----------|----------|-------------------|------------------|--------------------------|--------------------------|----------------|----------------|--------------|----------|
| 31      | 4        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 3        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |

### Highest military bonus (31) for:

| Economy | Military | Research | Wonder 1          | Wonder 2       | Wonder 3  | Wonder 4         | Wonder 5     | Wonder 6        | Wonder 7   | Wonder 8  |
|---------|----------|----------|-------------------|----------------|-----------|------------------|--------------|-----------------|------------|-----------|
| 7       | 31       | 4        | Temple of Artemis | Statue of Zeus | Colosseum | Palace of Aachen | Great Sphinx | Terracotta Army | Great Wall | Yggdrasil |

### Highest research bonus (15) for:

| Economy | Military | Research | Wonder 1         | Wonder 2            | Wonder 3              | Wonder 4              | Wonder 5   | Wonder 6       | Wonder 7     | Wonder 8     |
|---------|----------|----------|------------------|---------------------|-----------------------|-----------------------|------------|----------------|--------------|--------------|
| 11      | 2        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 11      | 2        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 8       | 2        | 15       | Stonehenge       | Hanging Gardens     | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 11      | 2        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 12      | 2        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 7       | 2        | 15       | Stonehenge       | Tomb of Mausolus    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 2        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 9       | 2        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 2        | 15       | Stonehenge       | Hagia Sophia        | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 7       | 6        | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 8       | 5        | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 6        | 15       | Stonehenge       | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 6       | 4        | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 7       | 4        | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 4       | 4        | 15       | Stonehenge       | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 7       | 3        | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Forbidden City | Great Wall   | Sayil Palace |
| 8       | 3        | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Forbidden City | Great Wall   | Yggdrasil    |
| 5       | 3        | 15       | Stonehenge       | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 9       | 6        | 15       | Hanging Gardens  | Palace of Aachen    | Sherwood Forest       | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 4        | 15       | Hanging Gardens  | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 8       | 3        | 15       | Hanging Gardens  | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 4       | 9        | 15       | Palace of Aachen | Sherwood Forest     | Cité de Carcassonne   | Leaning Tower of Pisa | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 5       | 8        | 15       | Palace of Aachen | Sherwood Forest     | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
| 4       | 5        | 15       | Sherwood Forest  | Cité de Carcassonne | Leaning Tower of Pisa | Alhambra              | Abu Simbel | Great Wall     | Sayil Palace | Yggdrasil    |
