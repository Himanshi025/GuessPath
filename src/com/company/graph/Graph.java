package com.company.graph;

import java.util.List;


public record Graph(List<Vertex> vertexes, List<Edge> edges) {
    /**
     * Just a record containing list of Vertexes and list of Edges.
     */
}