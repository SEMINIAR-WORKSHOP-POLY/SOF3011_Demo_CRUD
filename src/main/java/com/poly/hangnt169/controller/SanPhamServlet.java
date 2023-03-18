package com.poly.hangnt169.controller;

import com.poly.hangnt169.entity.SanPham;
import com.poly.hangnt169.repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author hangnt169
 */
@WebServlet(name = "SanPhamController", value = {
        "/san-pham/hien-thi",  // GET
        "/san-pham/add",      // POST
        "/san-pham/update",      // POST
        "/san-pham/delete",    // GET
        "/san-pham/view-update",// GET
        "/san-pham/view-add", // GET
        "/san-pham/detail"    // GET
})
public class SanPhamServlet extends HttpServlet {
    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThiSanPham(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdate(request, response);
        } else if (uri.contains("view-add")) {
            this.viewAdd(request, response);
        } else if (uri.contains("detail")) {
            this.detailSanPham(request, response);
        } else if (uri.contains("delete")) {
            this.deleteSanPham(request, response);
        } else {
            this.hienThiSanPham(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")) {
            this.addSanPham(request, response);
        } else if (uri.contains("update")) {
            this.updateSanPham(request, response);
        } else {
            this.hienThiSanPham(request, response);
        }
    }

    private void hienThiSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SanPham> lops = sanPhamRepository.getAll();
        request.setAttribute("lops", lops);
        request.getRequestDispatcher("/view/san-pham.jsp").forward(request, response);
    }

    private void viewAdd(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/view/add-san-pham.jsp");
    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        SanPham lop = sanPhamRepository.getOne(Long.valueOf(id));
        request.setAttribute("lopHoc", lop);
        List<SanPham> lops = sanPhamRepository.getAll();
        request.setAttribute("lops", lops);
        request.getRequestDispatcher("/view/update-san-pham.jsp").forward(request, response);
    }

    private void detailSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        SanPham lop = sanPhamRepository.getOne(Long.valueOf(id));
        request.setAttribute("lopHoc", lop);
        request.getRequestDispatcher("/view/detail-san-pham.jsp").forward(request, response);
    }

    private void deleteSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        SanPham lop = sanPhamRepository.getOne(Long.valueOf(id));
        sanPhamRepository.delete(lop);
        List<SanPham> lops = sanPhamRepository.getAll();
        request.setAttribute("lops", lops);
        request.getRequestDispatcher("/view/san-pham.jsp").forward(request, response);
    }

    private void addSanPham(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String ten = request.getParameter("ten");
        String loai = request.getParameter("loai");
        String gia = request.getParameter("gia");
        String slt = request.getParameter("slt");
        String mieuTa = request.getParameter("mieuTa");

        SanPham lop = new SanPham(ten, loai, Integer.valueOf(slt), Double.valueOf(gia), mieuTa);
        sanPhamRepository.add(lop);
        response.sendRedirect("/san-pham/hien-thi");

    }

    private void updateSanPham(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        String ten = request.getParameter("ten");
        String loai = request.getParameter("loai");
        String gia = request.getParameter("gia");
        String slt = request.getParameter("slt");
        String mieuTa = request.getParameter("mieuTa");
        SanPham lop = new SanPham(Long.valueOf(id), ten, loai, Integer.valueOf(slt), Double.valueOf(gia), mieuTa);
        sanPhamRepository.update(lop);
        response.sendRedirect("/san-pham/hien-thi");
    }
}
