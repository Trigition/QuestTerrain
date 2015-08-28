import random
import math

class Voronoi_Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_distance(self, voro_point):
        x_dif = (self.x - voro_point.x) ** 2
        y_dif = (self.y - voro_point.y) ** 2
        return math.sqrt(x_dif - y_dif)

    
