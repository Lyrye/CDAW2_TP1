package imt.nordeurope.j2ee.tp.tp1.servlets;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.*;

@WebServlet(name = "GraphicWeather", value = "/GraphicWeather")
public class GraphicWeatherServlet extends HttpServlet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpg");

        BufferedImage  bufferedImage  =  new  BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d  =  bufferedImage.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);

        if(request.getParameter("country")!= null){
            String country = request.getParameter("country");
            int[] temp = new int[10];

            switch(country) {
                case "France":
                    temp = new int[]{2, 3, 7, 8, 5, 9, 4, 1, 0, 10};
                    break;
                case "Germany":
                    temp = new int[]{-1, 3, 4, 10, 7, 4, 2, 1, 0, 11};
                    break;
                case "USA":
                    temp = new int[]{5,10,8,12,13,18,10,14,12,12};
                    break;
                case "England":
                    temp = new int[]{0, 3, 0, 1, 0, 5, 0, 1, 2,5 };
                    break;
                default:

                    break;
            }
            g2d.setColor(Color.BLACK);
           /* drawArrowLine(g2d,0,0,WIDTH,0,,5,2);*/

            g2d.drawLine(0, 0, 0, WIDTH);
            g2d.drawLine(0, 3*HEIGHT/4, WIDTH, 3*HEIGHT/4);
            for(int i = 0; i<10; i++) {
                g2d.setColor(Color.BLACK);
                g2d.drawString(Integer.toString(temp[i]), i*40 + 10, - (temp[i]*15) + 3*HEIGHT/4+20);
                g2d.setColor(Color.red);
                g2d.fill(new Ellipse2D.Float(i * 40 + 10 , -(temp[i]*15) + 3*HEIGHT/4 -4, 8, 8));
            }
            ImageIO.write(bufferedImage,"jpg",response.getOutputStream());
            g2d.dispose();

        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void drawArrowLine(Graphics2D g, int x1, int y1, int x2, int y2, int d, int h) {
        int dx = x2 - x1, dy = y2 - y1;
        double D = Math.sqrt(dx*dx + dy*dy);
        double xm = D - d, xn = xm, ym = h, yn = -h, x;
        double sin = dy / D, cos = dx / D;

        x = xm*cos - ym*sin + x1;
        ym = xm*sin + ym*cos + y1;
        xm = x;

        x = xn*cos - yn*sin + x1;
        yn = xn*sin + yn*cos + y1;
        xn = x;

        int[] xpoints = {x2, (int) xm, (int) xn};
        int[] ypoints = {y2, (int) ym, (int) yn};

        g.drawLine(x1, y1, x2, y2);
        g.fillPolygon(xpoints, ypoints, 3);
    }
}
