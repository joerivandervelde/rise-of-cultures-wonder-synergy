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

| Economy | Military | Research | Wonder 1  | Wonder 2         | Wonder 3        | Wonder 4            | Wonder 5     | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|-----------|------------------|-----------------|---------------------|--------------|-----------------|------------|--------------|
| 5       | 36       | 8        | Colosseum | Palace of Aachen | Sherwood Forest | Cité de Carcassonne | Great Sphinx | Terracotta Army | Great Wall | Sayil Palace |

### Highest research bonus (15) for:

| Economy | Military | Research | Wonder 1   | Wonder 2         | Wonder 3            | Wonder 4              | Wonder 5   | Wonder 6       | Wonder 7   | Wonder 8     |
|---------|----------|----------|------------|------------------|---------------------|-----------------------|------------|----------------|------------|--------------|
| 11      | 8        | 15       | Stonehenge | Hanging Gardens  | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 11      | 8        | 15       | Stonehenge | Tomb of Mausolus | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 8       | 8        | 15       | Stonehenge | Hagia Sophia     | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 7       | 14       | 15       | Stonehenge | Palace of Aachen | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 6       | 12       | 15       | Stonehenge | Sherwood Forest  | Cité de Carcassonne | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |

## Results (after removing 'bad bonuses')
### Highest overall combined bonuses (43) for:

| Economy | Military | Research | Wonder 1          | Wonder 2   | Wonder 3         | Wonder 4                 | Wonder 5       | Wonder 6       | Wonder 7       | Wonder 8     |
|---------|----------|----------|-------------------|------------|------------------|--------------------------|----------------|----------------|----------------|--------------|
| 29      | 6        | 8        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Lighthouse of Alexandria | Cheops Pyramid | Great Sphinx   | Forbidden City | Chichen Itza |
| 31      | 4        | 8        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City | Chichen Itza   | Tikal        |
| 28      | 6        | 9        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Hagia Sophia             | Cheops Pyramid | Great Sphinx   | Forbidden City | Chichen Itza |
| 30      | 4        | 9        | Temple of Artemis | Stonehenge | Tomb of Mausolus | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza   | Tikal        |
| 27      | 6        | 10       | Temple of Artemis | Stonehenge | Tomb of Mausolus | Leaning Tower of Pisa    | Cheops Pyramid | Great Sphinx   | Forbidden City | Chichen Itza |
| 29      | 4        | 10       | Temple of Artemis | Stonehenge | Tomb of Mausolus | Leaning Tower of Pisa    | Cheops Pyramid | Forbidden City | Chichen Itza   | Tikal        |

### Highest economy bonus (31) for:

| Economy | Military | Research | Wonder 1          | Wonder 2         | Wonder 3                 | Wonder 4                 | Wonder 5       | Wonder 6       | Wonder 7     | Wonder 8 |
|---------|----------|----------|-------------------|------------------|--------------------------|--------------------------|----------------|----------------|--------------|----------|
| 31      | 4        | 8        | Temple of Artemis | Stonehenge       | Tomb of Mausolus         | Lighthouse of Alexandria | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 3        | 2        | Temple of Artemis | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |
| 31      | 2        | 9        | Stonehenge        | Tomb of Mausolus | Lighthouse of Alexandria | Hagia Sophia             | Cheops Pyramid | Forbidden City | Chichen Itza | Tikal    |

### Highest military bonus (25) for:

| Economy | Military | Research | Wonder 1          | Wonder 2       | Wonder 3         | Wonder 4            | Wonder 5     | Wonder 6        | Wonder 7   | Wonder 8     |
|---------|----------|----------|-------------------|----------------|------------------|---------------------|--------------|-----------------|------------|--------------|
| 6       | 25       | 5        | Temple of Artemis | Statue of Zeus | Colosseum        | Palace of Aachen    | Great Sphinx | Terracotta Army | Great Wall | Sayil Palace |
| 6       | 25       | 4        | Temple of Artemis | Statue of Zeus | Colosseum        | Palace of Aachen    | Great Sphinx | Terracotta Army | Great Wall | Chichen Itza |
| 5       | 25       | 6        | Statue of Zeus    | Colosseum      | Palace of Aachen | Cité de Carcassonne | Great Sphinx | Terracotta Army | Great Wall | Sayil Palace |
| 5       | 25       | 5        | Statue of Zeus    | Colosseum      | Palace of Aachen | Cité de Carcassonne | Great Sphinx | Terracotta Army | Great Wall | Chichen Itza |

### Highest research bonus (15) for:

| Economy | Military | Research | Wonder 1   | Wonder 2         | Wonder 3            | Wonder 4              | Wonder 5   | Wonder 6       | Wonder 7   | Wonder 8     |
|---------|----------|----------|------------|------------------|---------------------|-----------------------|------------|----------------|------------|--------------|
| 11      | 2        | 15       | Stonehenge | Hanging Gardens  | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 11      | 2        | 15       | Stonehenge | Tomb of Mausolus | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 8       | 2        | 15       | Stonehenge | Hagia Sophia     | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 7       | 6        | 15       | Stonehenge | Palace of Aachen | Sherwood Forest     | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
| 6       | 4        | 15       | Stonehenge | Sherwood Forest  | Cité de Carcassonne | Leaning Tower of Pisa | Abu Simbel | Forbidden City | Great Wall | Sayil Palace |
