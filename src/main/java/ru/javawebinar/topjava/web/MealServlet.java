package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealTo;
import ru.javawebinar.topjava.util.MealData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(MealServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to users");
        String action = request.getParameter("action");
        List<MealTo> mealsToList = MealData.getInstance().getMealsToList();
        if ("delete".equals(action)) {
            String id = request.getParameter("mealId");
            List<MealTo> collect = mealsToList.stream().filter(m -> id.equals(m.getId())).collect(Collectors.toList());
            mealsToList.removeAll(collect);
        } else if ("edit".equals(action)) {
            String id = request.getParameter("mealId");
            List<MealTo> collect = mealsToList.stream().filter(m -> id.equals(m.getId())).collect(Collectors.toList());
            request.setAttribute("data", collect.get(0));
            request.getRequestDispatcher("edit.jsp").forward(request, response);
            return;
        }
        request.setAttribute("data", mealsToList);
        request.getRequestDispatcher("meals.jsp").forward(request, response);
    }
}